
import com.plagus_server.analysis.textual.levenshtein_distance.LevenshteinDistance;

import org.junit.Test;


import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * The Levenshtein distance tests.
 */
public class LevenshteinDistanceTests {

  /**
   * Lv distance raw data.
   */
  @Test
  public void lvDistanceRawData(){
  String fileOne = "hello world";
    String fileTwo = "w hello orld";

    LevenshteinDistance smallDistance = new LevenshteinDistance();
    int sizeDistance = smallDistance.levenshteinDistance(fileOne,fileTwo);
    assertEquals(sizeDistance,3);
  }

  /**
   * Lv distance python diff one.
   *
   * @throws IOException the io exception
   */
  @Test
  public void lvDistancePythonDiffOne() throws IOException {

    String fileOne = Files.readString(Path.of("res/Sample-code/py_file_1.py"), StandardCharsets.US_ASCII);

    String fileTwo= Files.readString(Path.of("res/Sample-code/py_file_2.py"), StandardCharsets.US_ASCII);


    LevenshteinDistance smallDistance = new LevenshteinDistance();
    int sizeDistance = smallDistance.levenshteinDistance(fileOne,fileTwo);
    assertEquals(sizeDistance,10);
  }


  /**
   * Lv distance js diff one.
   *
   * @throws IOException the io exception
   */
  @Test
  public void lvDistanceJSDiffOne() throws IOException {

    String fileOne = Files.readString(Path.of("res/Sample-code/js_file_1.js"), StandardCharsets.US_ASCII);

    String fileTwo= Files.readString(Path.of("res/Sample-code/js_file_2.js"), StandardCharsets.US_ASCII);


    LevenshteinDistance smallDistance = new LevenshteinDistance();
    int sizeDistance = smallDistance.levenshteinDistance(fileOne,fileTwo);
    assertEquals(sizeDistance,10);
  }

  /**
   * Lv distance js same file one.
   *
   * @throws IOException the io exception
   */
  @Test
  public void lvDistanceJSSameFileOne() throws IOException {

    String fileOne = Files.readString(Path.of("res/Sample-code/js_file_same_1.js"), StandardCharsets.US_ASCII);

    String fileTwo = Files.readString(Path.of("res/Sample-code/js_file_same_2.js"), StandardCharsets.US_ASCII);


    LevenshteinDistance smallDistance = new LevenshteinDistance();
    int sizeDistance = smallDistance.levenshteinDistance(fileOne,fileTwo);



    LevenshteinDistance.LevDistReport levDistanceReport =  new LevenshteinDistance.LevDistReport(sizeDistance , fileOne, fileTwo);

    int distanceReport = levDistanceReport.getDistance();
    String rightSide = levDistanceReport.getRight();
    String leftSide = levDistanceReport.getLeft();
    String globalReport = levDistanceReport.toString();

    assertEquals(rightSide,"function myFunction() {\n" +
            "    var y = document.getElementById(\"txt1\").value;\n" +
            "    var z = document.getElementById(\"txt2\").value;\n" +
            "    var x = y + z;\n" +
            "    document.getElementById(\"demo\").innerHTML = x;\n" +
            "}");
    assertEquals(leftSide,"function myFunction() {\n" +
            "    var y = document.getElementById(\"txt1\").value;\n" +
            "    var z = document.getElementById(\"txt2\").value;\n" +
            "    var x = y + z;\n" +
            "    document.getElementById(\"demo\").innerHTML = x;\n" +
            "}");
    assertEquals(sizeDistance,0);

    assertEquals(globalReport,"[function myFunction() {\n" +
            "    var y = document.getElementById(\"txt1\").value;\n" +
            "    var z = document.getElementById(\"txt2\").value;\n" +
            "    var x = y + z;\n" +
            "    document.getElementById(\"demo\").innerHTML = x;\n" +
            "}, function myFunction() {\n" +
            "    var y = document.getElementById(\"txt1\").value;\n" +
            "    var z = document.getElementById(\"txt2\").value;\n" +
            "    var x = y + z;\n" +
            "    document.getElementById(\"demo\").innerHTML = x;\n" +
            "}, 0]");
  }

  /**
   * Test one.
   */
  @Test
  public void testOne() {
    LevenshteinDistance lD = new LevenshteinDistance();

    String[] listJS1 = {"// This is a comment\n",

            "// yet another comment!!\n//wow another comment"};

    String[] listJS2 = {"// This is a great!! comment\n",

            "// yet another comment!!\n//wow another comment!"};

    List<LevenshteinDistance.LevDistReport> result = lD.levDistTwoLists(listJS1, listJS2);

    String actual = "[[// yet another comment!!\n" +
            "//wow another comment, // yet another comment!!\n" +
            "//wow another comment!, 1]]";

    assertEquals(result.toString(), actual);
  }
}
