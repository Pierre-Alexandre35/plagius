package backend_model;

import java.util.List;
import java.util.Set;

import analysis.lingustic.ProcessedASTData;
import backend_model.types.Submission;

/**
 * temporary representation of data. we are not sure if this will pan out.
 */
public interface ModelData {
  Set<Submission> getUserSubmissions(String userID);

  List<Submission> haveCommonSubString(String substr);

  List<Submission> haveCommonStructure(ProcessedASTData structure);
}
