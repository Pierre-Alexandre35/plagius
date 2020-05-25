package results;

import java.nio.file.Path;

/**
 * generates results for a given analysis.
 * @param <T> the analysis result type.
 */
public interface ResultGenerator<T> {
  String report (T t);
  Path reportToFile(T t);
}
