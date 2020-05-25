package com.plagus_server.analysis.lingustic.functions;

import com.plagus_server.analysis.lingustic.functions.listeners.PyVarReplacementListener;
import com.plagus_server.analysis.lingustic.python.Python3Parser;
import com.plagus_server.common.StudentFiles;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Extracts all functions from all files in both student submissions and returns a set of Funcdata
 * objects for each student.
 */
public class FuncExtractor {

  private final ParseTreeWalker parseTreeWalker;

  /**
   * Instantiates a new Func extractor.
   */
  public FuncExtractor() {
    parseTreeWalker = new ParseTreeWalker();
  }

  /**
   * Extract map.
   *
   * @param parseTreeMap1 the parse tree map 1
   * @param parseTreeMap2 the parse tree map 2
   * @return the map
   */
  public Map<StudentFiles, List<FuncData>> extract(Map<Path, ParseTree> parseTreeMap1,
                                                   Map<Path, ParseTree> parseTreeMap2) {

    // process first dataset
    List<FuncData> set1FunctionList = analyze(parseTreeMap1);
    //process second dataset
    List<FuncData> set2FunctionList = analyze(parseTreeMap2);


    //collect data into a map
    Map<StudentFiles, List<FuncData>> results = new HashMap<>();
    results.put(StudentFiles.USER_ONE, set1FunctionList);
    results.put(StudentFiles.USER_TWO, set2FunctionList);

    return results;
  }

  private List<FuncData> analyze(Map<Path, ParseTree> parseTreeMap) {
    List<FuncData> funcList = new ArrayList<>();
    for (var entry : parseTreeMap.entrySet()) {

      FuncListener funcListener = new FuncListener();
      parseTreeWalker.walk(funcListener, entry.getValue());

      List<FuncData> functionsInThis = funcListener.getFunctions();

      for (FuncData func : functionsInThis) {
        processEntry(entry, func);
      }
      funcList.addAll(functionsInThis);

    }
    return funcList;
  }

  private void processEntry(Map.Entry<Path, ParseTree> entry, FuncData func) {
    func.setPath(entry.getKey());
    Python3Parser.FuncdefContext cxt2 = func.getCtx();
    StringBuilder sb2 = new StringBuilder();
    PyVarReplacementListener varListener2 = new PyVarReplacementListener(sb2);
    parseTreeWalker.walk(varListener2, cxt2);
    func.setRenamed(sb2.toString());
  }
}
