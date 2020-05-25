package springAPI;

/**
 * This interface outlines the spring API with which the Java server can
 * communicate with the front end
 */
public interface SpringWebService {

  /**
   * POST API end point
   * This will allow use to recieve files from the front end
   */
  public recieveFiles();

  /**
   * GET API end point
   * This will allow the front end to retrieve plagiarism percentages
   */
  public deliverPercentage();


  /**
   * GET API end point
   * This will allow the front end to retrieve the diff indexes that represent
   * the lines where similarities occur in files
   */
  public deliverDiffIndexes();
}
