package com.plagus_server.analysis.textual.comment_filtering;

import com.plagus_server.common.Language;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Abstract comment filtering class
 */
public abstract class AbstractCommentFilter implements CommentFilter {
  private List<String> filterData;

  /**
   * The Scanner.
   */
  protected Scanner scanner;

  /**
   * Instantiates a new Abstract comment filter.
   *
   * @param scanner the scanner
   * @param comment the comment
   */
  protected AbstractCommentFilter(Scanner scanner, String comment) {
    filterData = new ArrayList<>();
    this.scanner = scanner;
    this.comment = comment;
    filterData();
  }


  private final String comment;

  @Override
  public List<String> getComments() {
    return Collections.unmodifiableList(filterData);
  }

  @Override
  public String[] getCommentsArray() {
    int len = filterData.size();
    return filterData.toArray(new String[len]);
  }

  /**
   * Filter the data to process back-to-back comments
   */
  private void filterData() {
    int count = 0;
    StringBuilder sb = new StringBuilder();
    String line;
    boolean lastReadWasComment = false;
    while (scanner.hasNextLine()) {
      line = scanner.nextLine();

      if (line.trim().startsWith(comment)) {
        sb.append(line);
        lastReadWasComment = true;
      } else {
        lastReadWasComment = false;
      }
      if (sb.length() > 0 && !lastReadWasComment) {
        filterData.add(sb.toString());
        sb = new StringBuilder();
      }
    }
    if (sb.length() > 0 && lastReadWasComment) {
      filterData.add(sb.toString());
    }


  }


}
