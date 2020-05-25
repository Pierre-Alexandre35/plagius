package com.plagus_server.analysis.textual.comment_filtering;

import com.plagus_server.common.Language;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

/**
 * Interface for comment filtering.
 */
public interface CommentFilter {

  /**
   * Gets comments.
   *
   * @return the comments
   */
  List<String> getComments();

  /**
   * Get comments array string [ ].
   *
   * @return the string [ ]
   */
  String[] getCommentsArray();


  /**
   * Of data comment filter.
   *
   * @param lang   the lang
   * @param reader the reader
   * @return the comment filter
   */
  static CommentFilter ofData(Language lang, Reader reader) {
    switch (lang) {
      case PYTHON:
        return new PythonCommentFilter(reader);
      case JAVASCRIPT:
        return new JSCommentFilter(reader);
      default:
        throw new IllegalStateException();
    }
  }

  /**
   * Of data comment filter.
   *
   * @param lang the lang
   * @param istr the istr
   * @return the comment filter
   */
  static CommentFilter ofData(Language lang, InputStream istr) {
    switch (lang) {
      case PYTHON:
        return new PythonCommentFilter(istr);
      case JAVASCRIPT:
        return new JSCommentFilter(new InputStreamReader(istr));
      default:
        throw new IllegalStateException();
    }
  }


}
