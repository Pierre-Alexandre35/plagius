package com.plagus_server.analysis.lingustic.functions.listeners;

import java.util.Map;

/**
 * The interface Var listener for reading and replacing vars in functions,namespaces.
 */
public interface VarListener {

  /**
   * Gets var map.
   *
   * @return the var map
   */
  Map<String, String> getVarMap();
}
