import com.plagus_server.common.Language;
import com.plagus_server.controller.PrimitiveByteArray;
import com.plagus_server.controller.reporting.Report;
import com.plagus_server.webService;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import org.springframework.mock.web.MockMultipartFile;

import java.nio.file.Path;
import java.util.Map;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * Factory testing.
 */
public class FactoryTesting {

  /**
   * Test atlr factory lexer.
   */
  @Test
  public void testAtlrFactoryLexer() {
    try {
      assertNotNull(Language
              .JAVASCRIPT.factory().getLexer("x=3".getBytes()));
    } catch (Exception e) {
      fail("no exception expected");
    }
  }

  /**
   * Test atlr factory parser.
   */
  @Test
  public void testAtlrFactoryParser() {
    try {
      assertNotNull(Language
              .JAVASCRIPT.factory().getParser("x=3".getBytes()));
    } catch (Exception e) {
      fail("no exception expected");
    }
  }

  /**
   * Test bad args to ws.
   */
  @Test
  public void testBadArgsToWS() {
    try {
      new webService().postFiles(new MockMultipartFile("null", "".getBytes()), new MockMultipartFile("null2", "x".getBytes()), "python");
      fail();
    } catch (RuntimeException e) {

    }

  }

  /**
   * Test get parse tree py.
   */
  @Test
  public void testGetParseTreePY() {
    Language l = Language.PYTHON;
    assertTrue(l.getParseTree("x=3\n".getBytes()) instanceof ParseTree);
  }

  /**
   * Test get parse tree js.
   */
  @Test
  public void testGetParseTreeJS() {
    Language l = Language.JAVASCRIPT;
    assertTrue(l.getParseTree("x=3\n".getBytes()) instanceof ParseTree);
  }


  /**
   * Test ext py.
   */
  @Test
  public void testExtPy() {
    Language l = Language.PYTHON;
    assertEquals(".py", l.getExt());

  }

  /**
   * Test ext js.
   */
  @Test
  public void testExtJS() {
    Language l = Language.JAVASCRIPT;
    assertEquals(".js", l.getExt());
  }

  /**
   * Test illegal args report one bad.
   */
  @Test
  public void testIllegalArgsReportOneBad() {
    try {
      Report.builder(Language.PYTHON).setData(Map.of(Path.of("res"),
              new PrimitiveByteArray("bytes".getBytes())))
              .setData(Map.of(Path.of("null"), null))
              .generateASTNodeCount()
              .generateCommentReport()
              .createReport();
      fail();
    } catch (Exception e) {
    }
    ;

  }

  /**
   * Test illegal args report two bad.
   */
  @Test
  public void testIllegalArgsReportTwoBad() {
    try {
      Report.builder(Language.PYTHON).setData(Map.of(null,
              new PrimitiveByteArray("bytes".getBytes())))
              .setData(Map.of(Path.of("null"), null))
              .generateASTNodeCount()
              .generateCommentReport()
              .createReport();
      fail();
    } catch (Exception e) {
    }
    ;

  }

  /**
   * Test illegal args report lang null.
   */
  @Test
  public void testIllegalArgsReportLangNull() {
    try {
      Report.builder(null).setData(Map.of(Path.of("res"),
              new PrimitiveByteArray("bytes".getBytes())))
              .setData(Map.of(Path.of("null"), null))
              .generateASTNodeCount()
              .generateCommentReport()
              .createReport();
      fail();
    } catch (Exception e) {
    }
    ;

  }
}
