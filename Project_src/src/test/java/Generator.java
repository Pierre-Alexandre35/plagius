import com.plagus_server.analysis.lingustic.python.Python3Lexer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Applying the Least Common Sub-sequence algorithm to a Python file with all the transformations
 * required and print the result.
 */
public class Generator {

  private final StringBuilder tokenString = new StringBuilder();

  /**
   * Generate token list list.
   *
   * @param file the file
   * @return the list
   * @throws IOException the io exception
   */
  public List<? extends Token>  generateTokenList(Path file) throws IOException {
    String currentFile = readFile(file);
    CharStream stream = stringToStream(currentFile);
    Lexer lexer = streamToLexing(stream);
    List<? extends Token> generatedListTokens = generateListTokens(lexer);

    return generatedListTokens;
  }

  private String readFile(Path file) throws IOException {
    Reader reader = Files.newBufferedReader(file);
    char[] chars = new char[1];
    StringBuilder sb = new StringBuilder();
    int buf;
    while ((buf = reader.read(chars))>0) {
      sb.append(chars[0]);
    }
    return sb.toString();
  }

  private CharStream stringToStream(String stringFile) {
    CharStream charStream = CharStreams.fromString(stringFile);
    return charStream;
  }

  private Lexer streamToLexing(CharStream charToLex) {
    Python3Lexer lexer = new Python3Lexer(charToLex);
    return lexer;
  }

  private List generateListTokens(Lexer lexer) {
    List<? extends Token> listTokenOne = lexer.getAllTokens();
    return listTokenOne;
  }


}
