
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.stream.Collectors;


import com.plagus_server.analysis.lingustic.python.Python3Lexer;
import com.plagus_server.analysis.lingustic.python.Python3Parser;

/**
 * Error node testing.
 */
public class ErrorNodeTesting {

  /**
   * Before.
   */
  @Before
  public void before() {
  }


  /**
   * Test py.
   *
   * @throws IOException the io exception
   */
  @Test
  public void testPy() throws IOException {


    Path tests = Path.of("res/err/Python");
    var roots = Files.walk(tests)
            .collect(Collectors.toList())
            .parallelStream()
            .filter(p -> p.toString().endsWith(".py"))
            .map(path -> {
              try {
                return Files.readString(path);
              } catch (IOException e) {
                return null;
              }
            })
            .filter(e -> e != null)
            .map(CharStreams::fromString)
            .map(Python3Lexer::new)
            .map(BufferedTokenStream::new)
            .map(Python3Parser::new)
            .collect(Collectors.toList());
    final var list = new ArrayList<Integer>();
    OutputStream o = new OutputStream() {
      @Override
      public void write(int b) throws IOException {
        list.add(b);
      }
    };
    int modCount = 0;
//    System.setErr(new PrintStream(o));
    int totalCount = 0;
    for (var p : roots) {
      System.out.println("COUNT: " + totalCount);

      totalCount++;
      if (list.size() > 0) {
        modCount++;
        list.removeAll(list);
      }
    }
    System.out.println("total: " + totalCount);
    System.out.println("fails: " + modCount);

  }
}
