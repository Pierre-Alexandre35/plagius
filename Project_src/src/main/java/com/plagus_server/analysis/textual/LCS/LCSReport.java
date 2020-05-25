package com.plagus_server.analysis.textual.LCS;
import com.plagus_server.common.StudentFiles;

import java.nio.file.Path;


/**
 * This class represents an LCS report
 */
public class LCSReport {
  private StudentFiles studentNo;
  private String FILE;


  private String lcsString;
  private int lcsLength;
  private int startingLine;
  private int endingLine;
  private int startingIndex;
  private int endingIndex;
  private int lcsPercentage;


  /**
   * Instantiates a new Lcs report.
   *
   * @param studentNo the student report
   * @param lcsAlgo   the lcs algo
   * @param current   the current
   */
  public LCSReport(StudentFiles studentNo, LongestCommonSubString lcsAlgo, Path current){
    this.studentNo = studentNo;
     this.FILE = current.toString();

    startingLine =  lcsAlgo.getStartingLine(studentNo.getNum());
    endingLine = lcsAlgo.getEndindLine(studentNo.getNum());
    startingIndex = lcsAlgo.getStartingIndex(studentNo.getNum());
    endingIndex = lcsAlgo.getEndingIndex(studentNo.getNum());
    lcsString = lcsAlgo.getLCSToString(studentNo.getNum());
    lcsLength = lcsAlgo.getLength(studentNo.getNum());
    lcsPercentage = lcsAlgo.percentageLCS(studentNo.getNum());
  }


  /**
   * Gets student no.
   *
   * @return the student no
   */
  public StudentFiles getStudentNo() {
    return studentNo;
  }

  /**
   * Get path string.
   *
   * @return the string
   */
  public String getPath(){
    return this.FILE;
  }

  /**
   * Get starting line int.
   *
   * @return the int
   */
  public int getStartingLine(){
    return startingLine;
  }

  /**
   * Get ending line int.
   *
   * @return the int
   */
  public int getEndingLine(){
    return endingLine;
  }

  /**
   * Get starting index int.
   *
   * @return the int
   */
  public int getStartingIndex(){
    return startingIndex;
  }

  /**
   * Get ending index int.
   *
   * @return the int
   */
  public int getEndingIndex(){
    return endingIndex;
  }

  /**
   * Get lcsto string string.
   *
   * @return the string
   */
  public String getLCSTOString(){
    return lcsString;
  }

  /**
   * Get lcs length int.
   *
   * @return the int
   */
  public int getLCSLength(){
    return lcsLength;
  }

  /**
   * Get percentage plagiarism int.
   *
   * @return the int
   */
  public int getPercentagePlagiarism(){
  return lcsPercentage;
  }
}
