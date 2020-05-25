package results;

import java.nio.file.Path;

import analysis.lingustic.ProcessedASTData;

/**
 * Generates result object for an ast analysis--the data in here is what a prof. will likely see.
 */
public class AstResultGenerator implements ResultGenerator<ProcessedASTData>{
  @Override
  public String report(ProcessedASTData processedASTData) {
    throw new UnsupportedOperationException("TODO");
  }

  @Override
  public Path reportToFile(ProcessedASTData processedASTData) {
    throw new UnsupportedOperationException("TODO");
  }
}
