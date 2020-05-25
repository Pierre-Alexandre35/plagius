package com.plagus_server.common;

import org.antlr.v4.runtime.tree.ParseTree;

/**
 * an enum for the languages as well as some metadata and tools surrounding them.
 */
public enum Language {
  PYTHON() {

    @Override
    public ParseTree getParseTree(byte[] bytes) {
      return factory().getParser(bytes).file_input();
    }


    @Override
    public String getExt() {
      return ".py";
    }

    @Override
    public   PythonAntlrFactory factory() {
      return PythonAntlrFactory.getInstance();
    }

    @Override
    public String getComment() {
      return "#";
    }
  },
  JAVASCRIPT() {

    @Override
    public ParseTree getParseTree(byte[] bytes) {
      return factory()
              .getParser(bytes)
              .program();
    }

    @Override
    public String getComment() {
      return "//";
    }

    @Override
    public String getExt() {
      return ".js";
    }

    @Override
    public  JavaScriptAntlrFactory factory() {
      return JavaScriptAntlrFactory.getInstance();
    }


  };


  /**
   * creates a root parse tree from byte data.
   *
   * @param bytes byte data.
   * @return parse tree at root of byte[] for lang
   */
  public abstract ParseTree getParseTree(byte[] bytes);

  /**
   * gets file extension with '.'.
   *
   * @return file extension as string.
   */
  public abstract String getExt();

  /**
   * abstract factory provider.
   *
   * @return the language factory.
   */
  public abstract AntlrFactory factory();

  public abstract String getComment();}
