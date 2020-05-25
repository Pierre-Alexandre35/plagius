package analysis.lingustic.language_components;

import java.util.List;

import analysis.lingustic.Element;

/**
 * recursive element for mapping recursive AST language_components.
 */
public abstract class RecursiveElement implements Element {

  @Override
  public boolean isLeaf() {
    return false;
  }
}
