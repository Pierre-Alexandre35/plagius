package com.plagus_server.analysis.textual.LCS;

import com.plagus_server.common.StudentFiles;

import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;


/**
 * Giving two different lists of Tokens, finding the longest common substring of those two lists.
 */
public class LongestCommonSubString {
  private final Map<LcsPair, Integer> sizeMap;
  /**
   * The Indexes lcs list one.
   */
  List<int[]> indexesLCSListOne = new ArrayList<>();
  /**
   * The Indexes lcs list two.
   */
  List<int[]> indexesLCSListTwo = new ArrayList<>();
  private List<? extends Token> tokenListOne;
  private List<? extends Token> tokenListTwo;
  // Mapping every students with the indexes to highlight
  private Map<StudentFiles, int[]> lcsResultsIndexes;
  //LCS results
  private String resultStrOne = "";
  private String resultStrTwo = "";
  private List<? extends Token> lcsTokensListOne;
  private List<? extends Token> lcsTokensListTwo;


  /**
   * Instantiates a new Longest common sub string.
   *
   * @param tokenListOne the token list one
   * @param tokenListTwo the token list two
   */
  public LongestCommonSubString(List<? extends Token> tokenListOne, List<? extends Token> tokenListTwo) {
    this.tokenListOne = tokenListOne;
    this.tokenListTwo = tokenListTwo;
    sizeMap = new HashMap<>();
  }


  /**
   * The runLCS method is filtering each list of token before processing and calling the subString
   * method (helper).
   */
  public void runLCS() {
    // remove all undesirable tokens before processing
    tokenListOne = filterWS(tokenListOne);
    tokenListTwo = filterWS(tokenListTwo);

    int sizeListOne = tokenListOne.size();
    int sizeListTwo = tokenListTwo.size();

    // helper method that contains the LCS logic
    subString(sizeListOne, sizeListTwo);
  }

  /**
   * Object gerN(int n){ var that =sizeMap.entrySet().stream().sorted(Comparator.comparing(e->e.getValue())).limit(3).collect(Collectors.toList());
   *
   * that.stream().map(e->subString(e.getKey().x,e.getKey().y))
   *
   * }
   */


  public List<? extends Token> getListTokens(int studentNumber) {
    if (studentNumber != 1 && studentNumber != 2) {
      throw new IllegalArgumentException("student number is either 1 or 2");
    } else if (studentNumber == 1) {
      return lcsTokensListOne;
    } else {
      return lcsTokensListTwo;
    }
  }


  public void getAllLCS() {
    for (LcsPair name : sizeMap.keySet()) {
      String key = name.toString();
      String value = sizeMap.get(name).toString();
      System.out.println(key + " " + value);
    }
  }

  /**
   * Iterating over both lists of tokens in order to find the common tokens. Every positive
   * results are flagged in a 2D array.
   *
   * @param sizeListOne size of the first list
   * @param sizeListTwo size of the second list
   */
  private void subString(int sizeListOne, int sizeListTwo) throws IllegalArgumentException {

    // check if lists are non-empty
    if (sizeListOne < 1 || sizeListTwo < 1) {
      throw new IllegalArgumentException("There is no tokens in the list one or/and list two");
    }

    // 2D array that is storing the result for equality between two tokens
    int[][] lcsResult = new int[sizeListOne + 1][sizeListTwo + 1];

    int len = 0;
    int row = 0;
    int col = 0;


    // iterating over the first and second lists
    for (int i = 0; i <= sizeListOne; i++) {
      for (int j = 0; j <= sizeListTwo; j++) {
        // First iteration
        if (i == 0 || j == 0)
          lcsResult[i][j] = 0;

          // If both tokens are equals
        else if (tokenListOne.get(i - 1).getText().equals(tokenListTwo.get(j - 1).getText())) {
          lcsResult[i][j] = lcsResult[i - 1][j - 1] + 1;
          sizeMap.put(new LcsPair(i, j), lcsResult[i][j]);
          if (len < lcsResult[i][j]) {
            len = lcsResult[i][j];
            row = i;
            col = j;
          }
        }

        // If both tokens are not equals
        else
          lcsResult[i][j] = 0;
      }
    }
    getTokenLocations(lcsResult, row, col, len);
  }

  /**
   * Function to get token locations
   *
   * @param lcsResult 2day int array
   * @param row       int row
   * @param col       int col
   * @param len       int len
   */
  private void getTokenLocations(int[][] lcsResult, int row, int col, int len) {

    // List that containts the position (line number + position in line) of every tokens to highlight on the list of tokens

    int i = 0;
    while (lcsResult[row][col] != 0) {
      int[] listOfMatchesOne = new int[2];
      int[] listOfMatchesTwo = new int[2];

      resultStrOne = tokenListOne.get(row - 1).getText() + resultStrOne;
      resultStrTwo = tokenListTwo.get(col - 1).getText() + resultStrTwo;

      listOfMatchesOne[0] = tokenListOne.get(row - 1).getLine();
      listOfMatchesOne[1] = tokenListOne.get(row - 1).getCharPositionInLine();
      listOfMatchesTwo[0] = tokenListTwo.get(col - 1).getLine();
      listOfMatchesTwo[1] = tokenListTwo.get(col - 1).getCharPositionInLine();


      indexesLCSListOne.add(listOfMatchesOne);
      indexesLCSListTwo.add(listOfMatchesTwo);

      i++;
      --len;
      row--;
      col--;
    }
  }

  /**
   * Gets starting line.
   *
   * @param studentNumber the student number
   * @return the starting line
   * @throws IllegalArgumentException the illegal argument exception
   */
  public int getStartingLine(int studentNumber) throws IllegalArgumentException {
    try {
      if (studentNumber != 1 && studentNumber != 2) {
        throw new IllegalArgumentException("student number is either 1 or 2");
      } else if (studentNumber == 1) {
        return getLcsStartingFromList(indexesLCSListOne);

      } else {
        return getLcsStartingFromList(indexesLCSListTwo);
      }
    } catch (IndexOutOfBoundsException e) {
      return -1;
    }
  }

  private int getLcsStartingFromList(List<int[]> indexesLCSListOne) {
    int lcsSize = indexesLCSListOne.size() - 1;
    if (lcsSize <= 0) {
      return -1;
    }
    return indexesLCSListOne.get(lcsSize)[0];
  }

  /**
   * Gets endind line.
   *
   * @param studentNumber the student number
   * @return the endind line
   * @throws IllegalArgumentException the illegal argument exception
   */
  public int getEndindLine(int studentNumber) throws IllegalArgumentException {
    try {
      if (studentNumber != 1 && studentNumber != 2) {
        throw new IllegalArgumentException("student number is either 1 or 2");
      } else if (studentNumber == 1) {
        return indexesLCSListOne.get(0)[0];
      } else {
        return indexesLCSListTwo.get(0)[0];
      }
    } catch (IndexOutOfBoundsException e) {
      return -1;
    }
  }

  /**
   * Gets starting index.
   *
   * @param studentNumber the student number
   * @return the starting index
   * @throws IllegalArgumentException the illegal argument exception
   */
  public int getStartingIndex(int studentNumber) throws IllegalArgumentException {
    try {
      if (studentNumber != 1 && studentNumber != 2) {
        throw new IllegalArgumentException("student number is either 1 or 2");
      } else if (studentNumber == 1) {
        return indexesLCSListOne.get(indexesLCSListOne.size() - 1)[1];
      } else {
        return indexesLCSListTwo.get(indexesLCSListTwo.size() - 1)[1];
      }
    } catch (IndexOutOfBoundsException e) {
      return -1;
    }
  }

  /**
   * Gets ending index.
   *
   * @param studentNumber the student number
   * @return the ending index
   * @throws IllegalArgumentException the illegal argument exception
   */
  public int getEndingIndex(int studentNumber) throws IllegalArgumentException {
    try {
      if (studentNumber != 1 && studentNumber != 2) {
        throw new IllegalArgumentException("student number is either 1 or 2");
      } else if (studentNumber == 1) {
        return indexesLCSListOne.get(0)[1];
      } else {
        return indexesLCSListTwo.get(0)[1];
      }
    } catch (IndexOutOfBoundsException e) {
      return -1;
    }
  }

  /**
   * Get map of results map.
   *
   * @return the map
   */
  public Map<StudentFiles, int[]> getMapOfResults() {
    return lcsResultsIndexes;
  }

  /**
   * Gets lcs to string.
   *
   * @param studentNumber the student number
   * @return the lcs to string
   * @throws IllegalArgumentException the illegal argument exception
   */
  public String getLCSToString(int studentNumber) throws IllegalArgumentException {
    if (studentNumber != 1 && studentNumber != 2) {
      throw new IllegalArgumentException("student number is either 1 or 2");
    } else if (studentNumber == 1) {
      return resultStrOne;
    } else {
      return resultStrTwo;
    }
  }

  /**
   * Gets length.
   *
   * @param studentNumber the student number
   * @return the length
   * @throws IllegalArgumentException the illegal argument exception
   */
  public int getLength(int studentNumber) throws IllegalArgumentException {
    if (studentNumber != 1 && studentNumber != 2) {
      throw new IllegalArgumentException("student number is either 1 or 2");
    } else if (studentNumber == 1) {
      return resultStrOne.length();
    } else {
      return resultStrTwo.length();
    }
  }

  /**
   * Percentage lcs
   *
   * @param studentNumber the student number
   * @return the percentage
   * @throws IllegalArgumentException student number is either 1 or 2
   */
  public int percentageLCS(int studentNumber) throws IllegalArgumentException {
    if (studentNumber != 1 && studentNumber != 2) {
      throw new IllegalArgumentException("student number is either 1 or 2");
    } else if (studentNumber == 1) {
      return resultStrOne.length() / tokenListOne.size();
    } else {
      return resultStrTwo.length() / tokenListTwo.size();
    }
  }

  /**
   * Remove all undesirable tokens for LCS analysis
   *
   * @param list list of tokens
   * @return processed list of tokens
   */
  private List<Token> filterWS(List<? extends Token> list) {
    return list
            .stream()
            .map(t -> (Token) t)
            .filter(t -> !(t.getType() == 99 || t.getType() == 98 || t.getType() == 39))
            .collect(Collectors.toList());
  }

  private static class LcsPair {
    private final int x;
    private final int y;

    public LcsPair(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public String toString() {
      return "LcsPair{" +
              "x=" + x +
              ", y=" + y +
              '}';
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof LcsPair)) return false;
      LcsPair lcsPair = (LcsPair) o;
      if (x != lcsPair.x) return false;
      return y == lcsPair.y;
    }

    @Override
    public int hashCode() {
      return Objects.hash(x + "," + y);
    }
  }


}
