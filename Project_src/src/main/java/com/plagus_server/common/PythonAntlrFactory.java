package com.plagus_server.common;

import com.plagus_server.analysis.lingustic.python.Python3Lexer;
import com.plagus_server.analysis.lingustic.python.Python3Parser;

/**
 * a python3 implementation of AntlrFactory.
 */
class PythonAntlrFactory extends AntlrFactory {
  private static PythonAntlrFactory factory;

  private PythonAntlrFactory() {
  }

  /**
   * Gets instance.
   *
   * @return the instance
   */
  public static PythonAntlrFactory getInstance() {
    if (factory == null) {
      factory = new PythonAntlrFactory();
    }
    return factory;
  }

  @Override
  public Python3Parser getParser(byte[] bytes) {
    return new Python3Parser(super.getTokenStream(bytes));
  }

  @Override
  public Python3Lexer getLexer(byte[] bytes) {
    return new Python3Lexer(super.getCharStreamFromBytes(bytes));
  }
}
