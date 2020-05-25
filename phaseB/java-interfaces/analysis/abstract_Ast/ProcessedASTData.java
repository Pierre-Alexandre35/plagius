package analysis.lingustic;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A data representation of AST data from code.
 */
public interface ProcessedASTData {



  default int size() {
    return commonElements().size();
  }

  default List<String> getAsString() {
    return commonElements()
            .stream()
            .map(Element::toString)//turns each to string
            .collect(Collectors.toList());//makes list
  }

  List<Element> commonElements();

}
