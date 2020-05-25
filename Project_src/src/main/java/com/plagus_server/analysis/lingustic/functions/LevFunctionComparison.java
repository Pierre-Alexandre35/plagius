package com.plagus_server.analysis.lingustic.functions;

import com.plagus_server.analysis.textual.levenshtein_distance.LevenshteinDistance;
import com.plagus_server.common.Language;
import com.plagus_server.common.StudentFiles;
import com.plagus_server.controller.PrimitiveByteArray;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * The type Lev function comparison.
 */
public class LevFunctionComparison {

  private final Language lang;
  private final LevenshteinDistance lev;
  private Map<StudentFiles, List<FuncData>> extracted;
  private Map<StudentFiles, Map<String, FuncData>> nestedMap;
  private  LevFuncReport levFuncReport;

  /**
   * Gets extracted.
   *
   * @return the extracted
   */
  public Map<StudentFiles, List<FuncData>> getExtracted() {
    return extracted;
  }

  /**
   * Gets lev dist list.
   *
   * @return the lev dist list
   */
  public List<LevenshteinDistance.LevDistReport> getLevDistList() {
    return levDistList;
  }

  private List<LevenshteinDistance.LevDistReport> levDistList;

  /**
   * Instantiates a new Lev function comparison.
   *
   * @param fileset1 the fileset 1
   * @param fileset2 the fileset 2
   * @param lang     the lang
   * @throws IOException the io exception
   */
  public LevFunctionComparison(Map<Path, PrimitiveByteArray> fileset1,
                               Map<Path, PrimitiveByteArray> fileset2, Language lang) throws IOException {
    this.lev = new LevenshteinDistance();
    this.lang = lang;
    var forExtract = fileset1
            .entrySet()
            .stream()
            .collect(Collectors
                    .toMap(Map.Entry::getKey,
                            fdr -> lang.getParseTree(fdr.getValue().getData())));

    var forExtract2 = fileset2
            .entrySet()
            .stream()
            .collect(Collectors
                    .toMap(Map.Entry::getKey,
                            fdr -> lang.getParseTree(fdr.getValue().getData())));
    extracted = new FuncExtractor().extract(forExtract, forExtract2);


    compare();
  }

  private void compare() {
    var list1 = extracted.get(StudentFiles.USER_ONE)
            .stream().map(FuncData::getRenamed).collect(Collectors.toList());

    var list2 = extracted.get(StudentFiles.USER_TWO)
            .stream().map(FuncData::getRenamed).collect(Collectors.toList());


    var strToFun1 = extracted.get(StudentFiles.USER_ONE)
            .stream().collect(Collectors.toMap(Function.identity(), FuncData::getRenamed));


    String[] first = list1.toArray(new String[list1.size()]);
    String[] second = list2.toArray(new String[list2.size()]);

    this.levDistList = lev.levDistTwoLists(first, second);

    this.nestedMap = extracted.entrySet()
            .stream()
            .collect(Collectors
                    .toMap(Map.Entry::getKey,
                            v -> v
                                    .getValue()
                                    .stream()
                                    .collect(Collectors.toMap(FuncData::getRenamed, Function.identity()))));
   var levfuncReportMap =  extracted.entrySet()
            .stream()
            .collect(Collectors
            .toMap(e -> e.getKey(), e -> e.getValue().stream().map(f ->
            FuncData.getReportFrom(f))
                    .collect(Collectors.toList())));
    levFuncReport = new LevFuncReport(levfuncReportMap, levDistList);
  }

  /**
   * Gets report.
   *
   * @return the report
   */
  public LevFuncReport getReport() {
    return this.levFuncReport;
  }

  /**
   * The type Lev func report.
   */
  public class LevFuncReport {

    private final Map<StudentFiles, List<FuncData.ReportVersion>> functionMap;
    private final List<LevenshteinDistance.LevDistReport> reportList;

    private LevFuncReport(Map<StudentFiles, List<FuncData.ReportVersion>> levFuncReport,
                         List<LevenshteinDistance.LevDistReport> reportList) {
      this.functionMap = levFuncReport;
      this.reportList = reportList;
    }

    /**
     * Gets function map.
     *
     * @return the function map
     */
    public Map<StudentFiles, List<FuncData.ReportVersion>> getFunctionMap() {
      return functionMap;
    }

    /**
     * Gets report list.
     *
     * @return the report list
     */
    public List<LevenshteinDistance.LevDistReport> getReportList() {
      return reportList;
    }
  }
}

