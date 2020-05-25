package analysis.textual;

/**
 * Representation of a section of a file that is similar or the same.
 */
public interface TextualAnalysis extends Comparable<TextualAnalysis> {
  long getStartIndex();
  long getEndIndex();
  long size();
  String getAssignment();
}
