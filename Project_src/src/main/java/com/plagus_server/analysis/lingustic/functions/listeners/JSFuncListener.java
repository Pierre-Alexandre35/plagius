package com.plagus_server.analysis.lingustic.functions.listeners;

import com.plagus_server.analysis.lingustic.functions.FuncData;
import com.plagus_server.analysis.lingustic.javascript.JavaScriptParser;
import com.plagus_server.analysis.lingustic.javascript.JavaScriptParserBaseListener;
import com.plagus_server.analysis.lingustic.javascript.JavaScriptParserListener;


import java.util.ArrayList;
import java.util.List;

/**
 * The type Js func listener.
 */
class  JSFuncListener extends JavaScriptParserBaseListener implements JavaScriptParserListener, FuncListener {


  /**
   * Instantiates a new Js func listener.
   */
  public JSFuncListener() {
    functions = new ArrayList<>();
  }

  @Override
  public List<FuncData> getFunctions() {
    return functions;
  }


  @Override
  public void enterFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx) {
//    functions.add(new FuncData(ctx));
  }

  private List<FuncData> functions;

}
