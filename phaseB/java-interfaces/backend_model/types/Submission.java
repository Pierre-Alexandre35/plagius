package backend_model.types;

import java.io.Reader;

/**
 * A submission by a student for an assignment.
 */
public interface Submission {
  Assignment getAssignment();
  Reader getAssignmentAsData();
  String getAssignmentName();
  String getSubmissionID();
}
