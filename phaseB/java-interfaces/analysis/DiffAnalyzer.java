package analysis;

import java.util.List;

import analysis.textual.TextualAnalysis;

/**
 * Analyzer for textual diff based
 */
public interface DiffAnalyzer extends Analyzer {
  List<TextualAnalysis> getNCommonSubStrings(int num);

  double percentSimilarity();

  List<String> getWrappedDiffs();
}
