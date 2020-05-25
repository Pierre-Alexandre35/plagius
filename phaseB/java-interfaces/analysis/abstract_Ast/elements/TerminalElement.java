package analysis.lingustic.language_components;

import java.util.List;

import analysis.lingustic.Element;

/**
 * terminal element for mapping AST language_components.
 */
public abstract class TerminalElement<T> implements Element {

  protected final String text = null;//TODO ADD CONSTRUCTOR

  protected final RecursiveElement parent = null;//for UML

  @Override
  public String getText() {
    throw new UnsupportedOperationException("TODO");
  }

  @Override
  public final boolean isLeaf() {
    return true;
  }

  @Override
  public final List<Element> children() {
    return List.of();
  }

  @Override
  public final List<Element> inOrderLeaves() {
    return List.of(this);
  }

  @Override
  public final List<Element> atThisLevel() {
    return List.of(this);
  }

  @Override
  public T getElementOfType() {
    throw new UnsupportedOperationException("TODO");
  }
}
