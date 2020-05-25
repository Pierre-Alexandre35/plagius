package com.plagus_server.controller.reporting;

import com.plagus_server.analysis.textual.comment_filtering.AggregateCommentFilter;
import com.plagus_server.analysis.textual.levenshtein_distance.LevenshteinDistance;
import com.plagus_server.common.Language;
import com.plagus_server.controller.PrimitiveByteArray;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The type Comment compare report.
 */
public class CommentCompareReport {
  private final Language lang;

  /**
   * Gets reports.
   *
   * @return the reports
   */
  public List<LevenshteinDistance.LevDistReport> getReports() {
    return Collections.unmodifiableList(reports);
  }

  private final List<LevenshteinDistance.LevDistReport> reports;

  /**
   * Instantiates a new Comment compare report.
   *
   * @param first  the first
   * @param second the second
   * @param lang   the lang
   */
  CommentCompareReport(Map<Path, PrimitiveByteArray> first, Map<Path, PrimitiveByteArray> second, Language lang) {
    this.lang = lang;


    var firstList = readerFromBytes(first.values());
    var secondList = readerFromBytes(second.values());
    var comments1 = processComments(firstList);
    var comments2 = processComments(secondList);

    LevenshteinDistance distance = new LevenshteinDistance();
    reports = distance.levDistTwoLists(comments1, comments2);

  }

  private String[] processComments(List<Reader> readers) {
    return new AggregateCommentFilter(readers, lang).getCommentsArray();
  }

  private List<Reader> readerFromBytes(Collection<PrimitiveByteArray> bytes) {
    return bytes
            .stream()
            .map(PrimitiveByteArray::getData)
            .map(ByteArrayInputStream::new)
            .map(InputStreamReader::new)
            .collect(Collectors.toList());
  }

}
