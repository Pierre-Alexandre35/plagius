package com.plagus_server.controller.reporting;

import com.plagus_server.analysis.lingustic.functions.listeners.ListenerSupplier;
import com.plagus_server.common.Language;
import com.plagus_server.controller.PrimitiveByteArray;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.nio.file.Path;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * The type Class counter report.
 */
public class ClassCounterReport {
  /**
   * Instantiates a new Class counter report.
   *
   * @param data the data
   * @param lang the lang
   */
  public ClassCounterReport(Map<Path, PrimitiveByteArray> data, Language lang) {

    var counter = ListenerSupplier.getCounterListener(lang);
    Consumer<ParseTree> f = (ParseTree pt) -> new ParseTreeWalker().walk(counter, pt);

    //the real work is done in the listener.
    data.entrySet()
            .parallelStream()
            .map(Map.Entry::getValue)
            .map(PrimitiveByteArray::getData)
            .map(lang::getParseTree)
            .forEach(f);
    classMap = counter.getCount().entrySet().stream().collect(Collectors.toMap(e -> e.getKey().getSimpleName(), e -> e.getValue()));
  }

  /**
   * Gets class map.
   *
   * @return the class map
   */
  public Map<String, Integer> getClassMap() {
    return classMap;
  }

  private final Map<String, Integer> classMap;
}
