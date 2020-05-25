package com.plagus_server.analysis.textual.comment_filtering;

import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

/**
 * Python comment filtering class
 */
public class PythonCommentFilter extends AbstractCommentFilter {

  /**
   * Instantiates a new Python comment filter.
   *
   * @param in input stream
   */
  PythonCommentFilter(InputStream in) {
    super(new Scanner(in), "#");
  }

  /**
   * Instantiates a new Python comment filter.
   *
   * @param reader the reader
   */
  PythonCommentFilter(Reader reader) {
    super(new Scanner(reader), "#");
  }

}
