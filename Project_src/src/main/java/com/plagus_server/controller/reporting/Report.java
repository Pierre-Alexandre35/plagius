package com.plagus_server.controller.reporting;

import com.plagus_server.analysis.lingustic.functions.LevFunctionComparison;
import com.plagus_server.analysis.textual.LCS.LCSMiniReport;
import com.plagus_server.analysis.textual.LCS.LCSMultifiles;
import com.plagus_server.common.Language;
import com.plagus_server.controller.PrimitiveByteArray;

import org.antlr.v4.runtime.Token;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * class for encapsulating and testing data sent to the server. build to support Gson to JSON
 * conversion.
 */
public class Report {
  private final Language lang;
  private final LevFunctionComparison.LevFuncReport levFuncReports;
  private final CommentCompareReport commentReport;
  private final LCSMultifiles.LCSMultiFileReport lcsReport;
  private final List<LCSMiniReport> minis;
  private List<Tuple> classCountList;

  private Report(Language lang,
                 LevFunctionComparison.LevFuncReport levFuncReports,
                 List<Tuple> classCountData, CommentCompareReport commentReport,
                 LCSMultifiles.LCSMultiFileReport lcsReport, List<LCSMiniReport> minis) {
    this.lang = lang;
    this.lcsReport = lcsReport;
    this.commentReport = commentReport;
    this.classCountList = classCountData;
    this.levFuncReports = levFuncReports;


    this.minis = this.lcsReport
            .getReports()
            .values()
            .stream()
            .map(e -> {
              var builder = LCSMiniReport.builder();

              e.forEach(x ->
                      builder.buildOne(x.getStudentNo(), x.getPath(), x.getLCSTOString(),
                              x.getStartingLine(), x.getStartingIndex(), x.getEndingLine(),
                              x.getEndingIndex()));
              return builder.createLCSMiniReport();
            })
            .collect(Collectors.toList());
  }

  /**
   * builder provider... must provide a language.
   *
   * @param lang the language.
   * @return a reportbuilder object
   */
  public static ReportBuilder builder(Language lang) {
    return new ReportBuilderV1(lang);
  }

  /**
   * Gets class count list.
   *
   * @return the class count list
   */
  public List<Tuple> getClassCountList() {
    return classCountList;
  }

  /**
   * getter method.
   *
   * @return the lev func reports
   */
  public LevFunctionComparison.LevFuncReport getLevFuncReports() {
    return levFuncReports;
  }

  /**
   * getter method.
   *
   * @return the lang
   */
  public Language getLang() {
    return lang;
  }

  /**
   * getter method.
   *
   * @return the comment report
   */
  public CommentCompareReport getCommentReport() {
    return commentReport;
  }


  private static class ReportBuilderV1 implements ReportBuilder {
    private List<Tuple> classCountData;
    private Map<Path, PrimitiveByteArray> dataMap1 = null;
    private Map<Path, PrimitiveByteArray> dataMap2 = null;
    private Language lang;
    private CommentCompareReport commentReport;
    private LevFunctionComparison.LevFuncReport levFuncReports;
    private LCSMultifiles.LCSMultiFileReport lcsReport;
    private List<LCSMiniReport> minis;

    ReportBuilderV1(Language lang) {
      this.lang = lang;
    }

    @Override
    public ReportBuilderV1 setData(Map<Path, PrimitiveByteArray> dataMap) {
      if (dataMap1 == null) {
        dataMap1 = dataMap;
      } else if (dataMap2 == null) {
        dataMap2 = dataMap;
      }
      return this;
    }

    @Override
    public ReportBuilderV1 generateCommentReport() {
      this.commentReport = new CommentCompareReport(dataMap1, dataMap2, lang);
      return this;
    }

    @Override
    public ReportBuilderV1 generateFunctionAnalysis() {
      try {
        levFuncReports = new LevFunctionComparison(dataMap1, dataMap2, lang).getReport();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return this;
    }


    @Override
    public Report createReport() {
      return new Report(lang, levFuncReports, classCountData, commentReport, lcsReport, minis);
    }

    @Override
    public ReportBuilder generateASTNodeCount() {
      Map<String, Integer> classCounter1 = new ClassCounterReport(dataMap1, lang).getClassMap();
      Map<String, Integer> classCounter2 = new ClassCounterReport(dataMap2, lang).getClassMap();
      Set<String> setOf = new HashSet<>();
      setOf.addAll(classCounter1.keySet());
      setOf.addAll(classCounter2.keySet());

      classCountData = setOf
              .stream()
              .map(s -> new Tuple(s.replace("Context", "")
                      .replaceAll("_", " "),
                      classCounter1.getOrDefault(s, 0),
                      classCounter2.getOrDefault(s, 0))).collect(Collectors.toList());
      return this;
    }

    @Override
    public ReportBuilder setLCSReport() {
      Map<Path, List<? extends Token>> tokenData1 = getPathTokenMap(dataMap1);
      Map<Path, List<? extends Token>> tokenData2 = getPathTokenMap(dataMap2);

      var lcs = new LCSMultifiles(tokenData1, tokenData2);

      lcs.compareAllFilesBtwEachStudent();
      minis = lcs.getMinis();
      this.lcsReport = lcs.getReport(5);

      return this;
    }

    private Map<Path, List<? extends Token>> getPathTokenMap(Map<Path, PrimitiveByteArray> dataMap) {
      Map<Path, List<? extends Token>> returnType = new HashMap<>();
      for (var entry : dataMap.entrySet()) {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(entry.getValue().getData());
             Reader r = new InputStreamReader(bis);
             BufferedReader br = new BufferedReader(r)) {

          String filtered = br.lines()
                  .filter(s -> !s.trim()
                          .startsWith(lang.getComment()))
                  .map(s -> s + "\n")
                  .reduce((s1, s2) -> s1 + s2).get();
          returnType.put(entry.getKey(), lang.factory().getLexer(filtered.getBytes()).getAllTokens());

        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return returnType;
    }
  }

  /**
   * The type Tuple.
   */
  static class Tuple {
    /**
     * The Rule.
     */
    final String rule;
    /**
     * The First count.
     */
    final int firstCount;
    /**
     * The Second count.
     */
    final int secondCount;

    /**
     * Instantiates a new Tuple.
     *
     * @param rule        the rule
     * @param firstCount  the first count
     * @param secondCount the second count
     */
    public Tuple(String rule, int firstCount, int secondCount) {
      this.rule = rule;
      this.firstCount = firstCount;
      this.secondCount = secondCount;
    }
    
  }


}
