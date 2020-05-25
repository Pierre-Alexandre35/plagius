import com.plagus_server.analysis.textual.comment_filtering.CommentFilter;
import com.plagus_server.analysis.textual.levenshtein_distance.LevenshteinDistance;
import com.plagus_server.common.Language;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * This class contains tests for our CommentFilter interface. It tests comments for both Python
 * and JavaScript.
 */
public class CommentFilterTests {

  /**
   * Test counting the number of single-line comments (on their own lines only) in a JavaScript
   * source file.
   *
   * @throws FileNotFoundException if no such file exists
   */
  @Test
  public void testJSCommentCount() throws FileNotFoundException {
    CommentFilter filter = CommentFilter.ofData(Language.JAVASCRIPT,
            new InputStreamReader(new FileInputStream(new File("test_data/js/file1.js"))));
    filter.getComments().forEach(System.out::println);
    assertEquals(3, filter.getComments().size());
  }

  /**
   * Test counting the number of single-line comments (on their own lines only) in a Python
   * source file.
   */
  @Test
  public void testPythonCommentCount() throws FileNotFoundException {
    CommentFilter filter = CommentFilter.ofData(Language.PYTHON,
            new InputStreamReader(new FileInputStream(new File("test_data/python/comments" +
                    "/student1/mixedComments.py"))));
    filter.getComments().forEach(System.out::println);
    assertEquals(2, filter.getComments().size());
  }

  private List<LevenshteinDistance.LevDistReport> getJSCommentReport() throws FileNotFoundException {
    CommentFilter filter1 = CommentFilter.ofData(Language.JAVASCRIPT,
            new InputStreamReader(new FileInputStream(new File("test_data/js/file1.js"))));
    CommentFilter filter2 = CommentFilter.ofData(Language.JAVASCRIPT,
            new InputStreamReader(new FileInputStream(new File("test_data/js/file2.js"))));
    LevenshteinDistance dist = new LevenshteinDistance();

    return dist.levDistTwoLists(filter1.getCommentsArray(), filter2.getCommentsArray());
  }

  private List<LevenshteinDistance.LevDistReport> getPythonCommentReport() throws FileNotFoundException {
    CommentFilter filter1 = CommentFilter.ofData(Language.PYTHON,
            new InputStreamReader(new FileInputStream(new File("test_data/python/comments" +
                    "/student1/mixedComments.py"))));
    CommentFilter filter2 = CommentFilter.ofData(Language.PYTHON,
            new InputStreamReader(new FileInputStream(new File("test_data/python/comments" +
                    "/student2/mixedComments.py"))));
    LevenshteinDistance dist = new LevenshteinDistance();

    return dist.levDistTwoLists(filter1.getCommentsArray(), filter2.getCommentsArray());
  }

  /**
   * Use the Levenshtein distance to test the number of similar comments in two JavaScript source
   * files.
   */
  @Test
  public void testNumJSSimilarComments() throws FileNotFoundException {
    List<LevenshteinDistance.LevDistReport> reports = getJSCommentReport();
    reports.forEach(System.out::println);
    assertEquals(2, reports.size());
  }

  /**
   * Test that the first report from getJSCommentReport() has a Levenshtein distance of 1.
   */
  @Test
  public void testSlightlySimilarJSComments() {
    try {
      List<LevenshteinDistance.LevDistReport> reports = getJSCommentReport();
      System.out.println(reports.get(0).getDistance());
      assertEquals(1, reports.get(0).getDistance());
    } catch (FileNotFoundException fnfe) {
      fail(fnfe.getMessage());
    }
  }

  /**
   * Test that the second report from getJSCommentReport() has a Levenshtein distance of 0.
   */
  @Test
  public void testIdenticalJSComments() {
    try {
      List<LevenshteinDistance.LevDistReport> reports = getJSCommentReport();
      assertEquals(0, reports.get(1).getDistance());
    } catch (FileNotFoundException fnfe) {
      fail(fnfe.getMessage());
    }
  }

  /**
   * Use the Levenshtein distance to test the number of similar comments between two Python
   * source files.
   */
  @Test
  public void testPythonCommentSimilarity() throws FileNotFoundException {
    List<LevenshteinDistance.LevDistReport> reports = getPythonCommentReport();
    reports.forEach(System.out::println);
    assertEquals(2, reports.size());
  }

  /**
   * Test that the first report from getPythonCommentReport() has a Levenshtein distance of 1.
   */
  @Test
  public void testSlightlySimilarPythonComments() {
    try {
      List<LevenshteinDistance.LevDistReport> reports = getPythonCommentReport();
      System.out.println(reports.get(0).getDistance());
      assertEquals(1, reports.get(0).getDistance());
    } catch (FileNotFoundException fnfe) {
      fail(fnfe.getMessage());
    }
  }

  /**
   * Test that the second report from getPythonCommentReport() has a Levenshtein distance of 0.
   */
  @Test
  public void testIdenticalPythonComments() {
    try {
      List<LevenshteinDistance.LevDistReport> reports = getPythonCommentReport();
      assertEquals(0, reports.get(1).getDistance());
    } catch (FileNotFoundException fnfe) {
      fail(fnfe.getMessage());
    }
  }

  /**
   * Test that two totally different comments in two Python source files won't appear in a
   * Levenshtein distance report.
   */
  @Test
  public void testDifferentPythonComments() throws FileNotFoundException {
    CommentFilter filter1 = CommentFilter.ofData(Language.PYTHON,
            new InputStreamReader(new FileInputStream(new File("test_data/python/comments" +
                    "/student1/insideFuncComment.py"))));
    filter1.getComments().forEach(System.out::println);
    CommentFilter filter2 = CommentFilter.ofData(Language.PYTHON,
            new InputStreamReader(new FileInputStream(new File("test_data/python/comments" +
                    "/student2/insideFuncComment.py"))));
    filter2.getComments().forEach(System.out::println);
    LevenshteinDistance dist = new LevenshteinDistance();
    assertEquals(0, dist.levDistTwoLists(filter1.getCommentsArray(), filter2.getCommentsArray()).size());
  }


}
