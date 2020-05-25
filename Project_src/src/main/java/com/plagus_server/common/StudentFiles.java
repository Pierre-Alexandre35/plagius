package com.plagus_server.common;

/**
 * enum for the two users.
 */
public enum StudentFiles {
  USER_ONE(1),
  USER_TWO(2);

  /**
   * constructor assigning a "magic number" to each.
   *
   * @param n the number for a given studentfiles
   */
  StudentFiles(int n) {
    num = n;
  }

  /**
   * getter for the number.
   *
   * @return the number associated with the user/submission.
   */
  public int getNum() {
    return num;
  }

  private final int num;

}