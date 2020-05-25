package com.plagus_server.controller.reporting;

import com.plagus_server.controller.PrimitiveByteArray;

import java.nio.file.Path;
import java.util.Map;

/**
 * The interface Report builder.
 */
public interface ReportBuilder {
  /**
   * Sets data.
   *
   * @param dataMap the data map
   * @return the data
   */
  ReportBuilder setData(Map<Path, PrimitiveByteArray> dataMap);

  /**
   * Generate comment report report builder.
   *
   * @return the report builder
   */
  ReportBuilder generateCommentReport();

  /**
   * Generate function analysis report builder.
   *
   * @return the report builder
   */
  ReportBuilder generateFunctionAnalysis();

  /**
   * Create report report.
   *
   * @return the report
   */
  Report createReport();

  /**
   * Generate ast node count report builder.
   *
   * @return the report builder
   */
  ReportBuilder generateASTNodeCount();

  /**
   * Sets lcs report.
   *
   * @return the lcs report
   */
  ReportBuilder setLCSReport();
}
