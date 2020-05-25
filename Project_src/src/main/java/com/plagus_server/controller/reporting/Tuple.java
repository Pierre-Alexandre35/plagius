package com.plagus_server.controller.reporting;

/**
 * The type Tuple. an immutable object.
 */
public final class Tuple {
  /**
   * The Rule.
   */
  private final String rule;
  /**
   * The First count.
   */
  private final int firstCount;
  /**
   * The Second count.
   */
  private final int secondCount;

  /**
   * Instantiates a new Tuple.
   *
   * @param rule        the rule
   * @param firstCount  the first count
   * @param secondCount the second count
   */
  public Tuple(String rule, int firstCount, int secondCount) {
    this.rule = rule;
    this.firstCount = firstCount;
    this.secondCount = secondCount;
  }

  /**
   * Gets rule.
   *
   * @return the rule
   */
  public final String getRule() {
    return rule;
  }

  /**
   * Gets first count.
   *
   * @return the first count
   */
  public final int getFirstCount() {
    return firstCount;
  }

  /**
   * Gets second count.
   *
   * @return the second count
   */
  public final int getSecondCount() {
    return secondCount;
  }
}
