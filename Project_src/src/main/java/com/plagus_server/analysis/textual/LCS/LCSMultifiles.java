package com.plagus_server.analysis.textual.LCS;

import com.plagus_server.common.StudentFiles;

import org.antlr.v4.runtime.Token;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

/**
 * The type Lcs report for multifiles
 */
public class LCSMultifiles {

  /**
   * The Student one.
   */
// Storing a list of reports given a Path. There is one map for every students of the same length and
  Map<Path, List<? extends Token>> studentOne;
  /**
   * The Student two.
   */
  Map<Path, List<? extends Token>> studentTwo;

  /**
   * The Paths to reports student one.
   */
  LinkedHashMap<Path, LCSReport> pathsToReportsStudentOne;
  /**
   * The Paths to reports student two.
   */
  LinkedHashMap<Path, LCSReport> pathsToReportsStudentTwo;
  private Map<Path, LCSReport> threshList;
 private List<LCSMiniReport> minis;

  public List<LCSMiniReport> getMinis() {
    return minis;
  }

  /**
   * Instantiates a new Lcs report multifiles.
   *
   * @param studentOne the student oneÒ
   * @param studentTwo the student two
   */
  public LCSMultifiles(Map<Path, List<? extends Token>> studentOne, Map<Path, List<? extends Token>> studentTwo) {
    this.studentOne = studentOne;
    this.studentTwo = studentTwo;
    pathsToReportsStudentOne = new LinkedHashMap<>();
    pathsToReportsStudentTwo = new LinkedHashMap<>();
      minis = new ArrayList<>();

  }


  /**
   * Compare all files between each student.
   */
  public void compareAllFilesBtwEachStudent() {

    // Looping over every files submitted by the first student
    for (Map.Entry<Path, List<? extends Token>> entryOne : studentOne.entrySet()) {
      // Looping over every files submitted by the second student
      for (Map.Entry<Path, List<? extends Token>> entryTwo : studentTwo.entrySet()) {
        minis.add(LCSMiniReport
                .get(entryOne.getKey(), entryTwo.getKey(),
                        entryOne.getValue(), entryTwo.getValue()));
        // Applying LCS algo between the current files
        LongestCommonSubString currentLCS = new LongestCommonSubString(entryOne.getValue(), entryTwo.getValue());
        currentLCS.runLCS();
        // Generate a report for each files compared during the application of the LCS
        LCSReport lcsReportSingleFileStudentOne = new LCSReport(StudentFiles.USER_ONE, currentLCS, entryOne.getKey());
        LCSReport lcsReportSingleFileStudentTwo = new LCSReport(StudentFiles.USER_TWO, currentLCS, entryTwo.getKey());

        // Store every reports generated into a lists.
        pathsToReportsStudentOne.put(entryOne.getKey(), lcsReportSingleFileStudentOne);
        pathsToReportsStudentTwo.put(entryTwo.getKey(), lcsReportSingleFileStudentTwo);

        // helper method to select the largest LCS of all the reports
        LCSReport studentOne = selectLargestLCS(StudentFiles.USER_ONE);
        LCSReport studentTwo = selectLargestLCS(StudentFiles.USER_TWO);
        generateObject(studentOne, studentTwo);
      }
    }
  }


  /**
   * Selecting the largest LCS from all the comparaisons
   *
   * @param number number of files
   * @return LCSReport
   */
  private LCSReport selectLargestLCS(StudentFiles number) {
    if (number.getNum() == 1) {
      LCSReport lcsReportCurrentMatchStd =
              pathsToReportsStudentOne
                      .values()
                      .stream()
                      .max(Comparator.comparing(LCSReport::getLCSLength))
                      .orElseThrow(NoSuchElementException::new);
      return lcsReportCurrentMatchStd;

    } else if (number.getNum() == 2) {
      LCSReport lcsReportCurrentMatchStd =
              pathsToReportsStudentTwo
                      .values()
                      .stream()
                      .max(Comparator.comparing(LCSReport::getLCSLength))
                      .orElseThrow(NoSuchElementException::new);
      return lcsReportCurrentMatchStd;

    }
    throw new IllegalArgumentException("not a valid student number");
  }

  /**
   * Generate object
   *
   * @param reportStudentOne LCSReport
   * @param reportStudentTwo LCSReport
   */
  private void generateObject(LCSReport reportStudentOne, LCSReport reportStudentTwo) {
    int studentOn = reportStudentOne.getStartingIndex();
    String pathStdOne = reportStudentOne.getPath();
  }

  public LCSMultiFileReport getReport(int thresh) {
//    List<LCSReport> reports = new ArrayList<>();
//    reports.addAll(pathsToReportsStudentOne.values().stream().filter(e -> e.getLCSLength() >= thresh).collect(Collectors.toList()));
//    reports.addAll(pathsToReportsStudentTwo.values().stream().filter(e -> e.getLCSLength() >= thresh).collect(Collectors.toList()));
    Map<StudentFiles, List<String>> map = new HashMap<>();
    for (StudentFiles s : StudentFiles.values()) {
      map.put(s, new ArrayList<>());
    }
    this.pathsToReportsStudentOne
            .values().stream()
            .collect(Collectors.toMap(e -> e.getPath(), e -> e.getStudentNo()))
            .entrySet().stream().forEach(e -> map.get(e.getValue()).add(e.getKey()));

    this.pathsToReportsStudentTwo
            .values().stream()
            .collect(Collectors
                    .toMap(e -> e.getPath(), e -> e.getStudentNo()))
            .entrySet().stream().forEach(e -> map.get(e.getValue()).add(e.getKey()));

   var tmp=List.of(
            this.pathsToReportsStudentOne
                    .values()
                    .stream()
                    .collect(Collectors.toMap(e -> e.getLCSTOString(), Function.identity()))
                    .entrySet(),
            this.pathsToReportsStudentTwo.values()
                    .stream()
                    .collect(Collectors.toMap(e -> e.getLCSTOString(), Function.identity()))
                    .entrySet())
            .stream()
            .flatMap(Collection::stream)
            .collect(toList()     );
   var tmp2 = tmp.stream().collect(Collectors.groupingBy(e->e.getKey(), mapping(Map.Entry::getValue, toList()) ));
   //(Collectors.groupingBy(Map.Entry::getKey, Collectors.toList()));
    return new LCSMultiFileReport(tmp2);
    //    return new LCSMultiFileReport(reports, map);
  }

  public static class LCSMultiFileReport {
    public Map<String, List<LCSReport>> getReports() {
      return reports;
    }

    private Map<String, List<LCSReport>> reports;

    public LCSMultiFileReport(Map<String, List<LCSReport>> m) {
      this.reports = m;
     }


   }

}
