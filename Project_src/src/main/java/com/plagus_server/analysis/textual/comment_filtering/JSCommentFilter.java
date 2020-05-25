package com.plagus_server.analysis.textual.comment_filtering;

import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

/**
 * Class for JavaScript comment filtering.
 */
public class JSCommentFilter extends AbstractCommentFilter {


  /**
   * Instantiates a new Js comment filter.
   *
   * @param str the string
   */
  JSCommentFilter(String str) {
    super(new Scanner(str), "//");
  }

  /**
   * Instantiates a new Js comment filter.
   *
   * @param reader the reader
   */
  JSCommentFilter(Reader reader) {
    super(new Scanner(reader), "//");
  }


}
