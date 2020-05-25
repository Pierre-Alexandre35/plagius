package funcTesting;

import org.junit.Test;

/**
 * The interface Test functions class.
 */
public interface TestFunctionsClass {

  /**
   * Two two identical.
   */
  @Test
  void twoTwoIdentical();

  /**
   * Test two swapped identical.
   */
  @Test
  void testTwoSwappedIdentical();

  /**
   * Test three unique.
   */
  @Test
  void testThreeUnique();

  /**
   * Test three in order all same.
   */
  @Test
  void testThreeInOrderAllSame();

  /**
   * Test three swap 12 same.
   */
  @Test
  void testThreeSwap12Same();

  /**
   * Test three swap 13 same.
   */
  @Test
  void testThreeSwap13Same();

  /**
   * Test three swap 23 same.
   */
  @Test
  void testThreeSwap23Same();

  /**
   * Test three swap two with noise.
   */
  @Test
  void testThreeSwapTwoWithNoise();

}
