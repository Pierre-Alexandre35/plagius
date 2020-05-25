package com.plagus_server.controller;

import com.plagus_server.common.Language;
import com.plagus_server.controller.reporting.Report;

import org.springframework.web.multipart.MultipartFile;

import java.io.Closeable;
import java.io.IOException;

/**
 * The interface Data flow.
 */
public interface DataFlow extends Closeable {


  /**
   * Of default data flow.
   *
   * @param zip1 the zip 1
   * @param zip2 the zip 2
   * @param lang the lang
   * @return the data flow
   * @throws IOException the io exception
   */
  static DataFlow ofDefault(MultipartFile zip1, MultipartFile zip2, Language lang) throws IOException {
    return new DataProcessor(zip1, zip2, lang);
  }

  /**
   * Build input data.
   *
   * @throws IOException              the io exception
   * @throws IllegalArgumentException the illegal argument exception
   * @throws IllegalStateException    the illegal state exception
   */
  void buildInputData() throws IOException, IllegalArgumentException, IllegalStateException;

  /**
   * Generate report report.
   *
   * @return the report
   * @throws IllegalStateException    the illegal state exception
   * @throws IllegalArgumentException the illegal argument exception
   * @throws IOException              the io exception
   */
  Report generateReport() throws IllegalStateException, IllegalArgumentException, IOException;
}



