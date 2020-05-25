import com.plagus_server.analysis.textual.LCS.LCSReport;
import com.plagus_server.analysis.textual.LCS.LongestCommonSubString;
import com.plagus_server.common.StudentFiles;

import org.antlr.v4.runtime.Token;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Lcs report tests
 */
public class LCSReportTest {

  /**
   * Generating indiv report one.
   *
   * @throws IOException the io exception
   */
  @Test
public void generatingIndivReportOne() throws IOException {
  Generator generatorTokens = new Generator();
  List<? extends Token> listOne = generatorTokens.generateTokenList(Path.of("res/Sample-code/js_file_same_ws_1.js"));
  List<? extends Token> listTwo = generatorTokens.generateTokenList(Path.of("res/Sample-code/js_file_same_ws_2.js"));

  LongestCommonSubString lcs = new LongestCommonSubString(listOne, listTwo);

  lcs.runLCS();

  LCSReport LCSReportStudentOne = new LCSReport(StudentFiles.USER_ONE,lcs,Path.of("res/Sample-code/js_file_same_ws_1.js"));
  LCSReport LCSReportStudentTwo = new LCSReport(StudentFiles.USER_TWO,lcs,Path.of("res/Sample-code/js_file_same_ws_1.js"));


  int sizeLCSOne = LCSReportStudentOne.getLCSLength();
  int sizeLCSTwo = LCSReportStudentTwo.getLCSLength();
  int startLineLCSOne = LCSReportStudentOne.getStartingLine();
  int startLineLCSTwo = LCSReportStudentTwo.getStartingLine();
  int endingLineLCSOne = LCSReportStudentOne.getEndingLine();
  int endingLineLCSTwo = LCSReportStudentTwo.getEndingLine();
  int startingIndexOne = LCSReportStudentOne.getStartingIndex();
  int startingIndexOTwo = LCSReportStudentTwo.getStartingIndex();
  String contentLCSOne = LCSReportStudentOne.getLCSTOString();
  String contentLCSTwo = LCSReportStudentOne.getLCSTOString();
  String pathOne  = LCSReportStudentOne.getPath().toString();
  String pathTwo  = LCSReportStudentOne.getPath().toString();


  assertEquals(pathOne, "res/Sample-code/js_file_same_ws_1.js");
  assertEquals(pathTwo, "res/Sample-code/js_file_same_ws_1.js");
  assertEquals(startLineLCSOne, 1);
  assertEquals(startLineLCSTwo, 1);
  assertEquals(endingLineLCSOne, 12);
  assertEquals(endingLineLCSTwo, 8);
  assertEquals(sizeLCSOne,161);
  assertEquals(sizeLCSTwo,161);
  assertEquals(startingIndexOne,0);
  assertEquals(startingIndexOTwo,0);
  assertEquals(contentLCSOne,"functionmyFunction(){vary=document.getElementById(\"txt1\").value;varz=document.getElementById(\"txt2\").value;varx=y+z;document.getElementById(\"demo\").innerHTML=x;}");
  assertEquals(contentLCSTwo,"functionmyFunction(){vary=document.getElementById(\"txt1\").value;varz=document.getElementById(\"txt2\").value;varx=y+z;document.getElementById(\"demo\").innerHTML=x;}");
}


  /**
   * Test multiple reports.
   */
  @Test
public void testMultipleReports(){
  Path fileOne = Path.of("res/Sample-code/js_file_same_ws_1.js");
  Path fileTwo = Path.of("res/Sample-code/js_file_same_ws_2.js");

  //Map <Path, List<? extends Token>> studentOne = new HashMap();
  //LCSReportMultifiles multipleReports = new LCSReportMultifiles();
}

}
