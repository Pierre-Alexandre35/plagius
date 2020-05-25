
import com.plagus_server.analysis.textual.LCS.LongestCommonSubString;
import com.plagus_server.common.StudentFiles;

import org.antlr.v4.runtime.Token;
import org.junit.Test;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import static org.junit.Assert.assertEquals;


/**
 * Lcs tests
 */
public class LCSTest {

  /**
   * Python different lcs one.
   *
   * @throws IOException the io exception
   */
  @Test
  public void pythonDifferentLCSOne() throws IOException {
    Generator generatorTokens = new Generator();
    List<? extends Token> listOne = generatorTokens.generateTokenList(Path.of("res/Sample-code/py_file_1.py"));
    List<? extends Token> listTwo = generatorTokens.generateTokenList(Path.of("res/Sample-code/py_file_2.py"));
    LongestCommonSubString lcs = new LongestCommonSubString(listOne, listTwo);
    lcs.runLCS();

    int sizeLCSOne = lcs.getLength(StudentFiles.USER_ONE.getNum());
    String valueLCSOne = lcs.getLCSToString(StudentFiles.USER_ONE.getNum());
    int startingLineOne = lcs.getStartingLine(StudentFiles.USER_ONE.getNum());
    int endingLineOne = lcs.getEndindLine(StudentFiles.USER_ONE.getNum());
    int startingIndexOne = lcs.getStartingIndex(StudentFiles.USER_ONE.getNum());
    int endingIndexOne = lcs.getEndingIndex(StudentFiles.USER_ONE.getNum());


    int sizeLCSTwo = lcs.getLength(StudentFiles.USER_TWO.getNum());
    String valueLCSTwo = lcs.getLCSToString(StudentFiles.USER_TWO.getNum());
    int startingLineTwo = lcs.getStartingLine(StudentFiles.USER_TWO.getNum());
    int endingLineTwo = lcs.getEndindLine(StudentFiles.USER_TWO.getNum());
    int startingIndexTwo = lcs.getStartingIndex(StudentFiles.USER_TWO.getNum());
    int endingIndexTwo = lcs.getEndingIndex(StudentFiles.USER_TWO.getNum());

    assertEquals(sizeLCSOne,63);
    assertEquals(valueLCSOne,"var='Hello World!'print(var)foriinrange(len(var)):print(var[i])");
    assertEquals(startingLineOne,2);
    assertEquals(startingIndexOne,4);
    assertEquals(endingLineOne,7);
    assertEquals(endingIndexOne,17);

    assertEquals(sizeLCSTwo,63);
    assertEquals(valueLCSTwo,"var='Hello World!'print(var)foriinrange(len(var)):print(var[i])");
    assertEquals(startingLineTwo,6);
    assertEquals(startingIndexTwo,4);
    assertEquals(endingLineTwo,11);
    assertEquals(endingIndexTwo,17);

  }


  /**
   * Js different lcs one.
   *
   * @throws IOException the io exception
   */
  @Test
  public void jsDifferentLCSOne() throws IOException {
    Generator generatorTokens = new Generator();
    List<? extends Token> listOne = generatorTokens.generateTokenList(Path.of("res/Sample-code/js_file_1.js"));
    List<? extends Token> listTwo = generatorTokens.generateTokenList(Path.of("res/Sample-code/js_file_2.js"));
    LongestCommonSubString lcs = new LongestCommonSubString(listOne, listTwo);
    lcs.runLCS();

    int sizeLCSOne = lcs.getLength(StudentFiles.USER_ONE.getNum());
    String valueLCSOne = lcs.getLCSToString(StudentFiles.USER_ONE.getNum());
    int startingLineOne = lcs.getStartingLine(StudentFiles.USER_ONE.getNum());
    int endingLineOne = lcs.getEndindLine(StudentFiles.USER_ONE.getNum());
    int startingIndexOne = lcs.getStartingIndex(StudentFiles.USER_ONE.getNum());
    int endingIndexOne = lcs.getEndingIndex(StudentFiles.USER_ONE.getNum());


    int sizeLCSTwo = lcs.getLength(StudentFiles.USER_TWO.getNum());
    String valueLCSTwo = lcs.getLCSToString(StudentFiles.USER_TWO.getNum());
    int startingLineTwo = lcs.getStartingLine(StudentFiles.USER_TWO.getNum());
    int endingLineTwo = lcs.getEndindLine(StudentFiles.USER_TWO.getNum());
    int startingIndexTwo = lcs.getStartingIndex(StudentFiles.USER_TWO.getNum());
    int endingIndexTwo = lcs.getEndingIndex(StudentFiles.USER_TWO.getNum());

    assertEquals(sizeLCSOne,107);
    assertEquals(valueLCSOne,"varvariable='Hello World!'console.log(variable)for(vari=0;i<variable.length;i++){console.log(variable[i])}}");
    assertEquals(startingLineOne,2);
    assertEquals(startingIndexOne,2);
    assertEquals(endingLineOne,9);
    assertEquals(endingIndexOne,0);

    assertEquals(sizeLCSTwo,107);
    assertEquals(valueLCSTwo,"varvariable='Hello World!'console.log(variable)for(vari=0;i<variable.length;i++){console.log(variable[i])}}");
    assertEquals(startingLineTwo,6);
    assertEquals(startingIndexTwo,2);
    assertEquals(endingLineTwo,13);
    assertEquals(endingIndexTwo,0);

  }


  /**
   * Js same file different spacing one.
   *
   * @throws IOException the io exception
   */
  @Test
  public void jsSameFileDifferentSpacingOne() throws IOException {
    Generator generatorTokens = new Generator();
    List<? extends Token> listOne = generatorTokens.generateTokenList(Path.of("res/Sample-code/js_file_same_ws_1.js"));
    List<? extends Token> listTwo = generatorTokens.generateTokenList(Path.of("res/Sample-code/js_file_same_ws_2.js"));
    LongestCommonSubString lcs = new LongestCommonSubString(listOne, listTwo);
    lcs.runLCS();

    int sizeLCSOne = lcs.getLength(StudentFiles.USER_ONE.getNum());
    String valueLCSOne = lcs.getLCSToString(StudentFiles.USER_ONE.getNum());
    int startingLineOne = lcs.getStartingLine(StudentFiles.USER_ONE.getNum());
    int endingLineOne = lcs.getEndindLine(StudentFiles.USER_ONE.getNum());
    int startingIndexOne = lcs.getStartingIndex(StudentFiles.USER_ONE.getNum());
    int endingIndexOne = lcs.getEndingIndex(StudentFiles.USER_ONE.getNum());


    int sizeLCSTwo = lcs.getLength(StudentFiles.USER_TWO.getNum());
    String valueLCSTwo = lcs.getLCSToString(StudentFiles.USER_TWO.getNum());
    int startingLineTwo = lcs.getStartingLine(StudentFiles.USER_TWO.getNum());
    int endingLineTwo = lcs.getEndindLine(StudentFiles.USER_TWO.getNum());
    int startingIndexTwo = lcs.getStartingIndex(StudentFiles.USER_TWO.getNum());
    int endingIndexTwo = lcs.getEndingIndex(StudentFiles.USER_TWO.getNum());

    assertEquals(sizeLCSOne,161);
    assertEquals(valueLCSOne,"functionmyFunction(){vary=document.getElementById(\"txt1\").value;varz=document.getElementById(\"txt2\").value;varx=y+z;document.getElementById(\"demo\").innerHTML=x;}");
    assertEquals(startingLineOne,1);
    assertEquals(startingIndexOne,0);
    assertEquals(endingLineOne,12);
    assertEquals(endingIndexOne,0);

    assertEquals(sizeLCSTwo,161);
    assertEquals(valueLCSTwo,"functionmyFunction(){vary=document.getElementById(\"txt1\").value;varz=document.getElementById(\"txt2\").value;varx=y+z;document.getElementById(\"demo\").innerHTML=x;}");
    assertEquals(startingLineTwo,1);
    assertEquals(startingIndexTwo,0);
    assertEquals(endingLineTwo,8);
    assertEquals(endingIndexTwo,0);
  }

  /**
   * Py palin one.
   *
   * @throws IOException the io exception
   */
  @Test
  public void pyPalinOne() throws IOException {
    Generator generatorTokens = new Generator();
    List<? extends Token> listOne = generatorTokens.generateTokenList(Path.of("res/Sample-code/py_file_palin_1.py"));
    List<? extends Token> listTwo = generatorTokens.generateTokenList(Path.of("res/Sample-code/py_file_palin_2.py"));
    LongestCommonSubString lcs = new LongestCommonSubString(listOne, listTwo);
    lcs.runLCS();

    int sizeLCSOne = lcs.getLength(StudentFiles.USER_ONE.getNum());
    String valueLCSOne = lcs.getLCSToString(StudentFiles.USER_ONE.getNum());
    int startingLineOne = lcs.getStartingLine(StudentFiles.USER_ONE.getNum());
    int endingLineOne = lcs.getEndindLine(StudentFiles.USER_ONE.getNum());
    int startingIndexOne = lcs.getStartingIndex(StudentFiles.USER_ONE.getNum());
    int endingIndexOne = lcs.getEndingIndex(StudentFiles.USER_ONE.getNum());
    int pencentageCopyOne = lcs.percentageLCS(StudentFiles.USER_ONE.getNum());



    int sizeLCSTwo = lcs.getLength(StudentFiles.USER_TWO.getNum());
    String valueLCSTwo = lcs.getLCSToString(StudentFiles.USER_TWO.getNum());
    int startingLineTwo = lcs.getStartingLine(StudentFiles.USER_TWO.getNum());
    int endingLineTwo = lcs.getEndindLine(StudentFiles.USER_TWO.getNum());
    int startingIndexTwo = lcs.getStartingIndex(StudentFiles.USER_TWO.getNum());
    int endingIndexTwo = lcs.getEndingIndex(StudentFiles.USER_TWO.getNum());
    int pencentageCopyTwo = lcs.percentageLCS(StudentFiles.USER_ONE.getNum());

    assertEquals(sizeLCSOne,120);
    assertEquals(valueLCSOne,"num=input('Enter any number : ')try:val=int(num)ifnum==str(num)[::-1]:print('The given number is PALINDROME')else:print(");
    assertEquals(startingLineOne,1);
    assertEquals(startingIndexOne,0);
    assertEquals(endingLineOne,7);
    assertEquals(endingIndexOne,13);
    assertEquals(pencentageCopyOne,2);


    assertEquals(sizeLCSTwo,120);
    assertEquals(valueLCSTwo,"num=input('Enter any number : ')try:val=int(num)ifnum==str(num)[::-1]:print('The given number is PALINDROME')else:print(");
    assertEquals(startingLineTwo,1);
    assertEquals(startingIndexTwo,0);
    assertEquals(endingLineTwo,7);
    assertEquals(endingIndexTwo,13);
    assertEquals(pencentageCopyOne,2);


  }


  /**
   * Modified comments layout js.
   *
   * @throws IOException the io exception
   */
  @Test
  public void ModifiedCommentsLayoutJS() throws IOException {
    Generator generatorTokens = new Generator();
    List<? extends Token> listOne = generatorTokens.generateTokenList(Path.of("res/Sample-code/ModifiedCommentsLayout/file1.js"));
    List<? extends Token> listTwo = generatorTokens.generateTokenList(Path.of("res/Sample-code/ModifiedCommentsLayout/file2.js"));
    LongestCommonSubString lcs = new LongestCommonSubString(listOne, listTwo);
    lcs.runLCS();

    int sizeLCSOne = lcs.getLength(StudentFiles.USER_ONE.getNum());
    String valueLCSOne = lcs.getLCSToString(StudentFiles.USER_ONE.getNum());
    int startingLineOne = lcs.getStartingLine(StudentFiles.USER_ONE.getNum());
    int endingLineOne = lcs.getEndindLine(StudentFiles.USER_ONE.getNum());
    int startingIndexOne = lcs.getStartingIndex(StudentFiles.USER_ONE.getNum());
    int endingIndexOne = lcs.getEndingIndex(StudentFiles.USER_ONE.getNum());


    int sizeLCSTwo = lcs.getLength(StudentFiles.USER_TWO.getNum());
    String valueLCSTwo = lcs.getLCSToString(StudentFiles.USER_TWO.getNum());
    int startingLineTwo = lcs.getStartingLine(StudentFiles.USER_TWO.getNum());
    int endingLineTwo = lcs.getEndindLine(StudentFiles.USER_TWO.getNum());
    int startingIndexTwo = lcs.getStartingIndex(StudentFiles.USER_TWO.getNum());
    int endingIndexTwo = lcs.getEndingIndex(StudentFiles.USER_TWO.getNum());

    assertEquals(sizeLCSOne,182);
    assertEquals(valueLCSOne,"functionblocksMinX(bs){varminX=blocksCount(bs)==0?consts.boardWidth:bs[0].x;for(vari=0;i<blocksCount(bs);i++){if(bs[i].x<minX)minX=bs[i].x;}returnminX;}exports.blocksMinX=blocksMinX;");
    assertEquals(startingLineOne,128);
    assertEquals(startingIndexOne,0);
    assertEquals(endingLineOne,136);
    assertEquals(endingIndexOne,31);

    assertEquals(sizeLCSTwo,182);
    assertEquals(valueLCSTwo,"functionblocksMinX(bs){varminX=blocksCount(bs)==0?consts.boardWidth:bs[0].x;for(vari=0;i<blocksCount(bs);i++){if(bs[i].x<minX)minX=bs[i].x;}returnminX;}exports.blocksMinX=blocksMinX;");
    assertEquals(startingLineTwo,206);
    assertEquals(startingIndexTwo,0);
    assertEquals(endingLineTwo,214);
    assertEquals(endingIndexTwo,31);
  }


  /**
   * Simple python diff.
   *
   * @throws IOException the io exception
   */
  @Test
  public void simplePythonDiff() throws IOException {
    Generator generatorTokens = new Generator();
    List<? extends Token> listOne = generatorTokens.generateTokenList(Path.of("res/Sample-code/py_simple_1.py"));
    List<? extends Token> listTwo = generatorTokens.generateTokenList(Path.of("res/Sample-code/py_simple_2.py"));
    LongestCommonSubString lcs = new LongestCommonSubString(listOne, listTwo);
    lcs.runLCS();

    String valueLCSOne = lcs.getLCSToString(StudentFiles.USER_ONE.getNum());
    String valueLCSTwo = lcs.getLCSToString(StudentFiles.USER_TWO.getNum());


    assertEquals(valueLCSOne,"defdfs_iter(graph,start,path=[]):q=[start]whileq:v=q.pop()ifvnotinpath:path+=[v]q+=graph[v]returnpathdefdfs_rec(graph,start,path=[]):path=path+[start]fornodeingraph[start]:ifnotnodeinpath:path=dfs_rec(graph,node,path)returnpathdefbfs_iter(graph,start,path=[]):");

    assertEquals(valueLCSTwo,"defdfs_iter(graph,start,path=[]):q=[start]whileq:v=q.pop()ifvnotinpath:path+=[v]q+=graph[v]returnpathdefdfs_rec(graph,start,path=[]):path=path+[start]fornodeingraph[start]:ifnotnodeinpath:path=dfs_rec(graph,node,path)returnpathdefbfs_iter(graph,start,path=[]):");

  }
}
