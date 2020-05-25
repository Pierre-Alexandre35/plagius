package results;

import java.nio.file.Path;

import analysis.textual.TextualAnalysis;

/**
 * Generates result object for an textual diff analysis--the data in here is what a prof. will likely see.
 */
public class DiffResultGenerator implements ResultGenerator<TextualAnalysis> {
  @Override
  public String report(TextualAnalysis textualAnalysis) {
    throw new UnsupportedOperationException("TODO");
  }

  @Override
  public Path reportToFile(TextualAnalysis textualAnalysis) {
    throw new UnsupportedOperationException("TODO");
  }
}
