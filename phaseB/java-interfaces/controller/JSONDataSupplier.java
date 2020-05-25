package controller;

/**
 * interface for sending and receiving JSON from the Spring framework.
 */
public interface JSONDataSupplier {

  /**
   * sends json to Spring by converting {@link ToServerJSON} object to json string.
   * @param json
   */
  void send(ToServerJSON json);

  /**
   * accesses JSON from Spring framework.
   * @param json object to be parsed.
   * @return received object.
   */
  FromServerJSON receive(String json);
}
