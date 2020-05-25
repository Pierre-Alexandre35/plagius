package com.plagus_server.analysis.lingustic.functions.listeners;

import com.plagus_server.analysis.lingustic.javascript.JavaScriptParser;
import com.plagus_server.analysis.lingustic.javascript.JavaScriptParserBaseListener;
import com.plagus_server.analysis.lingustic.javascript.JavaScriptParserListener;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Js var listener.
 */
class JSVarListener extends JavaScriptParserBaseListener implements JavaScriptParserListener, VarListener {


  private boolean inName;
  private int varCount;
  private Map<String, String> varMap;
  private StringBuilder sb;
  private boolean inParam;

  /**
   * Instantiates a new Js var listener.
   *
   * @param sb the sb
   */
  public JSVarListener(StringBuilder sb) {
    inName = false;
    inParam = false;
    varCount = 0;
    varMap = new HashMap<>();
    this.sb = sb;
  }

  private int count;

  @Override
  public void enterFormalParameterArg(JavaScriptParser.FormalParameterArgContext ctx) {
    inParam = ctx.Assign() != null;

  }

  @Override
  public void exitFormalParameterArg(JavaScriptParser.FormalParameterArgContext ctx) {
    inParam = false;
  }


  @Override
  public void enterAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx) {
    inName = ctx.Assign() != null;
  }

  @Override
  public void exitAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx) {
    inName = false;
  }

  @Override
  public void visitTerminal(TerminalNode node) {
    if (inParam && inParam) {
      System.out.println("inNameAndParam");
    }
    if (inParam || inParam) {
      if (!varMap.containsKey(node.getText())) {
        varMap.put(node.getText(), "var" + varCount);
        varCount++;
      }
      sb.append(varMap.get(node.getText()));
    } else {
      sb.append(node.getText());
    }
  }

  @Override
  public Map<String, String> getVarMap() {
    return this.varMap;
  }
}
