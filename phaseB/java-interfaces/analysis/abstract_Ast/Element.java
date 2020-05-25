package analysis.lingustic;

import java.util.List;

/**
 * element is a representation of an ast element mapped to a customized version for special-case analysis.
 */
public interface Element {
  String getText();
  boolean isLeaf();
  Element getParent();
  List<Element> children();
  List<Element> inOrderLeaves();//only useful at root
  List<Element> atThisLevel();
  <R> R getElementOfType();//specialization not sure if useful
}
