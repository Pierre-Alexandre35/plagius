package analysis;

import java.nio.file.Path;

/**
 * Base interface for analysis.
 */
public interface Analyzer {

  void supply(Path path);

  void supply(String file);
}
