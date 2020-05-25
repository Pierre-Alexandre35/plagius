package analysis;

import java.nio.file.Path;
import java.util.List;

import analysis.lingustic.ProcessedASTData;
import analysis.lingustic.Element;

/**
 * this handles all of the communication between the AST tool and the users.
 */
public interface ASTAnalyzer extends Analyzer {


  void  buildAll() throws IllegalStateException;//if supply

  Element execute();

  List<ProcessedASTData> getCommonStructures();
}
