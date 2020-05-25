package com.plagus_server.controller;

import java.util.Arrays;

/**
 * a wrapper class to prevent wrapping to Byte[] which is not accepted any io.
 */
public class PrimitiveByteArray {
  private final byte[] data;

  /**
   * constructor.... takes in the wrapped data.
   * @param data the byte data.
   */
  public PrimitiveByteArray(byte[] data) {
    this.data = data;
  }

  /**
   * a "getter" that preserves immutability by copying data.
   * @return a copy of the byte[]  data.
   */
  public final byte[] getData() {
    return Arrays.copyOf(data, data.length);
  }
}
