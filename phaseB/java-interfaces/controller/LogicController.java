package controller;

import java.nio.file.Path;

import analysis.lingustic.Element;
import results.Report;
import results.ResultGenerator;

;

/**
 * Controller for project. handles interfacing with view and analyzers.
 * @param <T>
 */
public interface LogicController<T> extends Report {

  ToServerJSON createServerReport();

  void readInNewServerData(JSONDataSupplier dataSupplier);

  Report<T> getReport(ResultGenerator<T> generator);

  Path getSubmissionData();//JSON STUFF

  Element getRootForAnalysis(Path p);//called for each folder--not file that is a submission

}
