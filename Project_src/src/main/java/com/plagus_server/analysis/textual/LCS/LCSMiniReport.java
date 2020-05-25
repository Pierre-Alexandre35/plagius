package com.plagus_server.analysis.textual.LCS;

import com.plagus_server.common.StudentFiles;

import org.antlr.v4.runtime.Token;

import java.nio.file.Path;
import java.util.List;

/**
 * The type Lcs mini report.
 */
public class LCSMiniReport {
  private final StudentFiles student1;
  private final StudentFiles student2;
  private final String text;
  private final String file1;
  private final String file2;
  private final int startRow1;
  private final int startRow2;
  private final int startCol1;
  private final int startCol2;
  private final int endRow1;
  private final int endRow2;
  private final int endCol1;
  private final int endCol2;

  /**
   * Instantiates a new Lcs mini report.
   *
   * @param student1  the student 1
   * @param student2  the student 2
   * @param text1     the text 1
   * @param text2     the text 2
   * @param file1     the file 1
   * @param file2     the file 2
   * @param startRow1 the start row 1
   * @param startRow2 the start row 2
   * @param startCol1 the start col 1
   * @param startCol2 the start col 2
   * @param endRow1   the end row 1
   * @param endRow2   the end row 2
   * @param endCol1   the end col 1
   * @param endCol2   the end col 2
   */
  public LCSMiniReport(StudentFiles student1, StudentFiles student2, String text1, String text2, String file1, String file2, int startRow1, int startRow2, int startCol1, int startCol2, int endRow1, int endRow2, int endCol1, int endCol2) {
    assert text1.equals(text2) : "LCS TEXT NOT EQUAL. FOUND: \n"+text1+"\nand\n"+text2+"\n";
    this.student1 = student1;
    this.student2 = student2;
    this.text = text1;
    this.file1 = file1;
    this.file2 = file2;
    this.startRow1 = startRow1;
    this.startRow2 = startRow2;
    this.startCol1 = startCol1;
    this.startCol2 = startCol2;
    this.endRow1 = endRow1;
    this.endRow2 = endRow2;
    this.endCol1 = endCol1;
    this.endCol2 = endCol2;
  }


  /**
   * Get lcs mini report.
   *
   * @param one       the one
   * @param two       the two
   * @param oneTokens the one tokens
   * @param twoTokens the two tokens
   * @return the lcs mini report
   */
  public static LCSMiniReport get(Path one, Path two,
                                  List<? extends Token> oneTokens,
                                  List<? extends Token> twoTokens) {
    var lcs = new LongestCommonSubString(oneTokens, twoTokens);
    lcs.runLCS();
    var builder = new Builder();
    builder.setFile1(one.toString()).setFile2(two.toString());
    builder.setStartCol1(lcs.getStartingIndex(1))
            .setStartRow1(lcs.getStartingLine(1))
            .setEndRow1(lcs.getEndindLine(1))
            .setEndCol1(lcs.getEndingIndex(1));
    lcs = new LongestCommonSubString(twoTokens, oneTokens);

    builder
            .setStartCol2(lcs.getStartingIndex(1))
            .setStartRow2(lcs.getStartingLine(1))
            .setEndRow2(lcs.getEndindLine(1))
            .setEndCol2(lcs.getEndingIndex(1));
    return builder.createLCSMiniReport();

  }

  /**
   * Builder builder.
   *
   * @return the builder
   */
  public static Builder builder() {
    return new Builder();
  }


  /**
   * The type Builder.
   */
  public static class Builder {
    private StudentFiles student1;
    private StudentFiles student2;

    private String text1;
    private String text2;

    private String file1;
    private String file2;

    private int startRow1;
    private int startRow2;
    private int startCol1;
    private int startCol2;
    private int endRow1 = -9;
    private int endRow2 = -9;
    private int endCol1 = -9;
    private int endCol2 = -9;


    private Builder() {
    }


    /**
     * Build first builder.
     *
     * @param student  the student
     * @param file1    the file 1
     * @param text     the text
     * @param startRow the start row
     * @param startCol the start col
     * @param endRow   the end row
     * @param endCol   the end col
     * @return the builder
     */
    public Builder buildFirst(StudentFiles student, String file1, String text,
                              int startRow, int startCol, int endRow, int endCol) {
      return setStudent1(student)
              .setFile1(file1)
              .setText1(text)
              .setStartRow1(startRow)
              .setStartCol1(startCol)
              .setEndRow1(endRow)
              .setEndCol1(endCol);
    }

    /**
     * Build second builder.
     *
     * @param student  the student
     * @param file2    the file 2
     * @param text     the text
     * @param startRow the start row
     * @param startCol the start col
     * @param endRow   the end row
     * @param endCol   the end col
     * @return the builder
     */
    public Builder buildSecond(StudentFiles student, String file2,
                               String text,
                               int startRow, int startCol, int endRow,
                               int endCol) {
      return setStudent2(student)
              .setFile2(file2)
              .setText2(text)
              .setStartRow2(startRow)
              .setStartCol2(startCol)
              .setEndRow2(endRow)
              .setEndCol2(endCol);
    }


    /**
     * Sets text 1.
     *
     * @param text the text
     * @return the text 1
     */
    public Builder setText1(String text) {
      this.text1 = text;
      return this;
    }

    /**
     * Sets text 2.
     *
     * @param text the text
     * @return the text 2
     */
    public Builder setText2(String text) {
      this.text2 = text;
      return this;
    }


    /**
     * Sets student 1.
     *
     * @param student the student
     * @return the student 1
     */
    public Builder setStudent1(StudentFiles student) {
      this.student1 = student;
      return this;
    }

    /**
     * Sets student 2.
     *
     * @param student the student
     * @return the student 2
     */
    public Builder setStudent2(StudentFiles student) {
      this.student2 = student;
      return this;
    }

    /**
     * Sets file 1.
     *
     * @param file1 the file 1
     * @return the file 1
     */
    public Builder setFile1(String file1) {
      this.file1 = file1;
      return this;
    }

    /**
     * Sets file 2.
     *
     * @param file2 the file 2
     * @return the file 2
     */
    public Builder setFile2(String file2) {
      this.file2 = file2;
      return this;
    }

    /**
     * Sets start row 1.
     *
     * @param startRow1 the start row 1
     * @return the start row 1
     */
    public Builder setStartRow1(int startRow1) {
      this.startRow1 = startRow1;
      return this;
    }

    /**
     * Sets start row 2.
     *
     * @param startRow2 the start row 2
     * @return the start row 2
     */
    public Builder setStartRow2(int startRow2) {
      this.startRow2 = startRow2;
      return this;
    }

    /**
     * Sets start col 1.
     *
     * @param startCol1 the start col 1
     * @return the start col 1
     */
    public Builder setStartCol1(int startCol1) {
      this.startCol1 = startCol1;
      return this;
    }

    /**
     * Sets start col 2.
     *
     * @param startCol2 the start col 2
     * @return the start col 2
     */
    public Builder setStartCol2(int startCol2) {
      this.startCol2 = startCol2;
      return this;
    }

    /**
     * Sets end row 1.
     *
     * @param endRow1 the end row 1
     * @return the end row 1
     */
    public Builder setEndRow1(int endRow1) {
      this.endRow1 = endRow1;
      return this;
    }

    /**
     * Sets end row 2.
     *
     * @param endRow2 the end row 2
     * @return the end row 2
     */
    public Builder setEndRow2(int endRow2) {
      this.endRow2 = endRow2;
      return this;
    }

    /**
     * Sets end col 1.
     *
     * @param endCol1 the end col 1
     * @return the end col 1
     */
    public Builder setEndCol1(int endCol1) {
      this.endCol1 = endCol1;
      return this;
    }

    /**
     * Sets end col 2.
     *
     * @param endCol2 the end col 2
     * @return the end col 2
     */
    public Builder setEndCol2(int endCol2) {
      this.endCol2 = endCol2;
      return this;
    }

    /**
     * Create lcs mini report lcs mini report.
     *
     * @return the lcs mini report
     */
    public LCSMiniReport createLCSMiniReport() {

      return new LCSMiniReport(student1, student2, text1, text2, file1, file2, startRow1,
              startRow2, startCol1, startCol2, endRow1, endRow2, endCol1, endCol2);
    }

    public Builder buildOne(StudentFiles studentNo,
                            String path, String lcstoString,
                            int startingLine, int startingIndex,
                            int endingLine, int endingIndex) {
      if (studentNo.getNum() == 1) {
        return buildFirst(studentNo, path, lcstoString, startingLine,
                startingIndex, endingLine, endingIndex);
      } else if (studentNo.getNum() == 2) {
        return buildSecond(studentNo, path, lcstoString, startingLine,
                startingIndex, endingLine, endingIndex);
      }
      return this;
    }
  }
}
