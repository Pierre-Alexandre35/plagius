package com.plagus_server.common;


import com.plagus_server.analysis.lingustic.javascript.JavaScriptLexer;
import com.plagus_server.analysis.lingustic.javascript.JavaScriptParser;
import com.plagus_server.analysis.lingustic.python.Python3Lexer;
import com.plagus_server.analysis.lingustic.python.Python3Parser;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

/**
 * abstract factory for creating antlr components.
 */
public abstract class AntlrFactory {

  /**
   * abstract method that creates a parser from bytes.
   *
   * @param bytes the byte data.
   * @return a Parser.
   */
  public abstract Parser getParser(byte[] bytes);


  /**
   * Token stream factory method from bytes. primarily used by other factory methods.
   *
   * @param bytes byte data.
   * @return a tokenstream from byte data.
   */
  public TokenStream getTokenStream(byte[] bytes) {
    return new BufferedTokenStream(getLexer(bytes));
  }

  /**
   * abstract factory method for creating lexer.
   *
   * @param bytes byte data
   * @return returns a lexer.
   */
  public abstract Lexer getLexer(byte[] bytes);

  /**
   * creates a charstream from bytes. primarily used by other factory methods.
   *
   * @param bytes byte data.
   * @return the charstream for antlr use.
   */
  public CharStream getCharStreamFromBytes(byte[] bytes) {
    return CharStreams.fromString(new String(bytes));
  }
}


