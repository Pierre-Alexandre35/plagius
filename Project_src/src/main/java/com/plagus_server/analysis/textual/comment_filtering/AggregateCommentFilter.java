package com.plagus_server.analysis.textual.comment_filtering;

import com.plagus_server.common.Language;

import java.io.Reader;
import java.util.Collection;
import java.util.List;
 import java.util.stream.Collectors;

/**
 * Aggregate comment filtering class
 */
public class AggregateCommentFilter implements CommentFilter {
  private final List<String> list;

  /**
   * Instantiates a new Aggregate comment filter.
   *
   * @param dataList the data list
   * @param language the language
   */
  public AggregateCommentFilter(List<Reader> dataList, Language language) {
    this.list = dataList.stream()
            .map(r->CommentFilter.ofData(language, r))
            .map(CommentFilter::getComments)
            .flatMap(Collection::stream)
            .collect(Collectors.toList());
  }

  @Override
  public List<String> getComments() {
    return list;
  }

  @Override
  public String[] getCommentsArray() {
    String[] arr = getComments().toArray(new String[list.size()]);
    return arr;
  }
}
