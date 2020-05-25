package com.plagus_server.common;

import com.plagus_server.analysis.lingustic.javascript.JavaScriptLexer;
import com.plagus_server.analysis.lingustic.javascript.JavaScriptParser;

/**
 * a javascript implementation of AntlrFactory.
 */
class JavaScriptAntlrFactory extends AntlrFactory {
  private static JavaScriptAntlrFactory factory;

  private JavaScriptAntlrFactory() {
  }

  /**
   * Gets instance.
   *
   * @return the instance
   */
  public static JavaScriptAntlrFactory getInstance() {
    if (factory == null) {
      factory = new JavaScriptAntlrFactory();
    }
    return factory;
  }

  @Override
  public JavaScriptParser getParser(byte[] bytes) {
    return new JavaScriptParser(super.getTokenStream(bytes));
  }

  @Override
  public JavaScriptLexer getLexer(byte[] bytes) {
    return new JavaScriptLexer(getCharStreamFromBytes(bytes));
  }
}
