import org.antlr.v4.runtime.Token;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * The type Tokenization tests.
 */
public class TokenizationTests {


  /**
   * Test python medium file one.
   *
   * @throws IOException the io exception
   */
  @Test
  public void testPythonMediumFileOne() throws IOException {

    Generator generatorTokens = new Generator();
    List<? extends Token> listOne = generatorTokens.generateTokenList(Path.of("res/Sample-code/py_foo_2.py"));

    assertEquals(listOne.get(0).getLine(), 1);
    assertEquals(listOne.get(0).getCharPositionInLine(), 0);
    assertEquals(listOne.get(0).getText(), "def");
    assertEquals(listOne.get(0).getType(), 4);

    assertEquals(listOne.get(40).getLine(), 6);
    assertEquals(listOne.get(40).getCharPositionInLine(), 20);
    assertEquals(listOne.get(40).getText(), ",");
    assertEquals(listOne.get(40).getType(), 54);

  }
}


