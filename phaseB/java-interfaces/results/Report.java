package results;

import java.util.List;
import java.util.Map;
import java.util.Set;

import backend_model.types.Assignment;
import backend_model.types.Submission;

/**
 * the base language_components expected in any report.
 * @param <T> the report type.
 */
public interface Report<T> {
  List<Map<Assignment, Set<Submission>>> getAllSimilars(ResultGenerator<T> resultGenerator);
  List<Set<Submission>> getSimilarsByAssignment();
}
