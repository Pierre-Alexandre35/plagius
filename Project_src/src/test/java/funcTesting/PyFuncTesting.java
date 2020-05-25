package funcTesting;

import com.plagus_server.analysis.lingustic.functions.LevFunctionComparison;
import com.plagus_server.analysis.textual.levenshtein_distance.LevenshteinDistance;
import com.plagus_server.common.Language;
import com.plagus_server.controller.PrimitiveByteArray;

import org.junit.Before;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * This test suite tests different cases of plagiarism in Python functions. Each of these tests
 * should find a Levenshtein distance of 0 between any two similar functions.
 */
public class PyFuncTesting implements TestFunctionsClass {

  /**
   * The Compare.
   */
  LevFunctionComparison compare;
  /**
   * The Student 1.
   */
  Map<Path, PrimitiveByteArray> student1;
  /**
   * The Student 2.
   */
  Map<Path, PrimitiveByteArray> student2;

  /**
   * Reads in contents from two files to be compared for a unit test.
   *
   * @param file1 student 1's file
   * @param file2 student 2's file
   * @throws IOException if a file doesn't exist or can't be read for some other reason
   */
  private void readFiles(String file1, String file2) throws IOException {
    FileReader fr1 = new FileReader(file1);
    StringBuilder contents1 = new StringBuilder();
    int i1;
    while ((i1 = fr1.read()) != -1) {
      contents1.append((char) i1);
    }
    PrimitiveByteArray wrapper1 = new PrimitiveByteArray(contents1.toString().getBytes());
    student1.put(Paths.get(file1), wrapper1);

    FileReader fr2 = new FileReader(file2);
    StringBuilder contents2 = new StringBuilder();
    int i2;
    while ((i2 = fr2.read()) != -1) {
      contents2.append((char) i2);
    }
    PrimitiveByteArray wrapper2 = new PrimitiveByteArray(contents2.toString().getBytes());
    student2.put(Paths.get(file2), wrapper2);
  }

  /**
   * Before.
   */
  @Before
  public void before() {
    student1 = new HashMap<>();
    student2 = new HashMap<>();
  }

  /**
   * Two two identical.
   */
  @Test
  @Override
  public void twoTwoIdentical() {
    try {
      readFiles("test_data/python/lcs_singleFile/student1/fullyIdentical.py", "test_data/python" +
              "/lcs_singleFile/student2/fullyIdentical.py");
      compare = new LevFunctionComparison(student1, student2, Language.PYTHON);
      var reports = compare.getLevDistList();
      for (LevenshteinDistance.LevDistReport report : reports) {
        System.out.println(report);
        assertEquals(0, report.getDistance());
      }
    } catch (IOException ioe) {
      fail(ioe.getMessage());
    }
  }

  /**
   * Test two swapped identical.
   */
  @Override
  public void testTwoSwappedIdentical() {
    try {
      readFiles("test_data/python/lcs_singleFile/student1/fullyIdentical.py", "test_data/python" +
              "/lcs_singleFile/student2/fullyIdentical.py");
      compare = new LevFunctionComparison(student1, student2, Language.PYTHON);
      var reports = compare.getLevDistList();
      for (LevenshteinDistance.LevDistReport report : reports) {
        System.out.println(report);
        assertEquals(0, report.getDistance());
      }
    } catch (IOException ioe) {
      fail(ioe.getMessage());
    }
  }

  /**
   * Test three unique.
   */
  @Override
  public void testThreeUnique() {
    throw new UnsupportedOperationException("TODO");
  }

  /**
   * Test three in order all same.
   */
  @Override
  public void testThreeInOrderAllSame() {
    throw new UnsupportedOperationException("TODO");
  }

  /**
   * Test three swap 12 same.
   */
  @Override
  public void testThreeSwap12Same() {
    throw new UnsupportedOperationException("TODO");
  }

  /**
   * Test three swap 13 same.
   */
  @Override
  public void testThreeSwap13Same() {
    throw new UnsupportedOperationException("TODO");
  }

  /**
   * Test three swap 23 same.
   */
  @Override
  public void testThreeSwap23Same() {
    throw new UnsupportedOperationException("TODO");
  }

  /**
   * Test three swap two with noise.
   */
  @Override
  public void testThreeSwapTwoWithNoise() {
    throw new UnsupportedOperationException("TODO");
  }

  /**
   * Tests two files with several functions each. They have a mix of comments, swapped function
   * definitions, and variable renamings.
   */
  @Test
  public void testFuncExtractor() {
    try {
      readFiles("test_data/python/misc/student1/testFuns.py", "test_data/python" +
              "/misc/student2/plagiarisation.py");
      compare = new LevFunctionComparison(student1, student2, Language.PYTHON);
      var reports = compare.getReport();
      for (LevenshteinDistance.LevDistReport report : compare.getLevDistList()) {

        System.out.println(report);
        assertEquals(0, report.getDistance());
      }
    } catch (Exception e) {
      fail(e.getMessage());
    }
  }

  /**
   * Testing two functions that have different behaviour.
   */
  @Test
  public void testFilesWithLessSimilarities() {
    try {
      readFiles("test_data/python/misc/student1/py_file_1.py", "test_data/python/misc" +
              "/student2/py_file_2.py");
      compare = new LevFunctionComparison(student1, student2, Language.PYTHON);
      var reports = compare.getReport();
      assertEquals(0, compare.getLevDistList().size());
    } catch (Exception e) {
      fail(e.getMessage());
    }
  }


}
