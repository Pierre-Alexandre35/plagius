package com.plagus_server.analysis.lingustic.functions.listeners;

import com.plagus_server.common.Language;

/**
 * The type Listener supplier.
 */
public class ListenerSupplier {
  /**
   * Gets func listener.
   *
   * @param language the language
   * @return the func listener
   */
  public static FuncListener getFuncListener(Language language) {
    switch (language) {
      case JAVASCRIPT:
        return new JSFuncListener();
      case PYTHON:
//        return new PyFuncListener();

      default:
        throw new IllegalArgumentException("not part of enum");
    }
  }

  /**
   * Gets var listener.
   *
   * @param language the language
   * @param sb       the sb
   * @return the var listener
   */
  public static VarListener getVarListener(Language language, StringBuilder sb) {
    switch (language) {
      case JAVASCRIPT:
        return new JSVarListener(sb);
      case PYTHON:
        return new PyVarReplacementListener(sb);
      default:
        throw new IllegalArgumentException("not part of enum");
    }
  }


  /**
   * Gets counter listener.
   *
   * @param language the language
   * @return the counter listener
   */
  public static CounterListener getCounterListener(Language language) {
    switch (language) {
      case JAVASCRIPT:
        return new JSCounter();
      case PYTHON:
        return new PyCounter();
      default:
        throw new IllegalArgumentException("not part of enum");
    }
  }
}
