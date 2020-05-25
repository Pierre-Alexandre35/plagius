package com.plagus_server.analysis.textual.levenshtein_distance;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Class to calculate Levenshtein Distance between 2 strings This also handles checking
 * Levenshtein Distance between 2 lists of strings
 */
public class LevenshteinDistance {

  /**
   * Using dynamic programming to calculate levenshtein distance between 2 strings
   *
   * @param str1 left arg
   * @param str2 right arg
   */
  public int levenshteinDistance(String str1, String str2) {


    int[][] dyProgArray = new int[str1.length() + 1][str2.length() + 1];

    for (int i = 0; i <= str1.length(); i++) {
      for (int j = 0; j <= str2.length(); j++) {
        if (i == 0) {
          dyProgArray[i][j] = j;
        } else if (j == 0) {
          dyProgArray[i][j] = i;
        } else {
          var w = dyProgArray[i - 1][j - 1];
          if (str1.charAt(i - 1) != str2.charAt(j - 1)) {
            w++;
          }
          dyProgArray[i][j] =
                  Math.min(Math.min(w, str2.charAt(j - 1)),
                          Math.min(dyProgArray[i - 1][j] + 1, dyProgArray[i][j - 1] + 1));
        }
      }
    }

    return dyProgArray[str1.length()][str2.length()];
  }


  /**
   * Levenshtein Distance Report Class
   */
  public static class LevDistReport {

    private final int distance;
    private final String left;
    private final String right;

    /**
     * Constructor for Lev Dist Report left comment is associated with set1 right comment is
     * associated with set2
     *
     * @param distance distance int
     * @param left     left string
     * @param right    right string
     */
    public LevDistReport(int distance, String left, String right) {
      this.distance = distance;
      this.left = left;
      this.right = right;
    }

    /**
     * Get distance
     *
     * @return distance int
     */
    public int getDistance() {
      return distance;
    }

    /**
     * get left string
     *
     * @return left string
     */
    public String getLeft() {
      return left;
    }

    /**
     * get right string
     *
     * @return right string
     */
    public String getRight() {
      return right;
    }

    /**
     * String representation of lev dist report
     *
     * @return string
     */
    @Override
    public String toString() {
      return "[" + this.left + ", " + this.right + ", " + this.distance + "]";
    }
  }

  /**
   * Give two lists of strings. Calculate lev dist between all of them (n^2). Then generate report
   * of matches, if any. Report if lev dest is above a certain threshold
   *
   * @param list1 list1 of strings
   * @param list2 list2 of strings
   * @return list of lev dist reports
   */
  public List<LevDistReport> levDistTwoLists(String[] list1, String[] list2) {
    int threshold = 5;

    List<LevDistReport> accumulation = new ArrayList<>();

    for (String string1 : list1) {

      for (String string2 : list2) {

        int levDist = this.
                levenshteinDistance(string1, string2);
        if (levDist <= threshold) {
          accumulation.add(new LevDistReport(levDist, string1, string2));
        }
      }
    }

    return accumulation;
  }
}

