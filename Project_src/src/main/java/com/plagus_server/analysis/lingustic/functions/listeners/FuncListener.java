package com.plagus_server.analysis.lingustic.functions.listeners;

import com.plagus_server.analysis.lingustic.functions.FuncData;

import org.antlr.v4.runtime.tree.ParseTreeListener;

import java.util.List;

/**
 * The interface Func listener.
 */
public interface FuncListener extends ParseTreeListener {

  /**
   * Gets functions.
   *
   * @return the functions
   */
  List<FuncData> getFunctions();
}
