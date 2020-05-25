package com.plagus_server.analysis.lingustic.functions.listeners;


import com.plagus_server.analysis.lingustic.javascript.JavaScriptParserBaseListener;
import com.plagus_server.analysis.lingustic.python.Python3BaseListener;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeListener;

import java.util.HashMap;
import java.util.Map;

/**
 * The interface Counter listener.
 */
public interface CounterListener extends ParseTreeListener {
  /**
   * Gets count.
   *
   * @return the count
   */
  Map<Class, Integer> getCount();
}

/**
 * The type Js counter.
 */
class JSCounter extends JavaScriptParserBaseListener implements CounterListener {
  private final Map<Class, Integer> counter;

  /**
   * Instantiates a new Js counter.
   */
  public JSCounter() {
    this.counter = new HashMap<>();

  }

  @Override
  public Map<Class, Integer> getCount() {
    return counter;
  }

  @Override
  public void enterEveryRule(ParserRuleContext context) {
    Class clazz = context.getClass();
    counter.put(clazz, counter.getOrDefault(clazz, 0) + 1);
  }
}

/**
 * The type Py counter.
 */
class PyCounter extends Python3BaseListener implements CounterListener {
  private final Map<Class, Integer> counter;

  /**
   * Instantiates a new Py counter.
   */
  public PyCounter() {
    this.counter = new HashMap<>();

  }

  @Override
  public Map<Class, Integer> getCount() {
    return counter;
  }

  @Override
  public void enterEveryRule(ParserRuleContext context) {
    Class clazz = context.getClass();
    counter.put(clazz, counter.getOrDefault(clazz, 0) + 1);
  }
}
