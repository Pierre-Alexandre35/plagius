package com.plagus_server.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.antlr.v4.runtime.Token;

import java.nio.file.Path;

/**
 * The type Plagus gson static supplied type.
 */
public class PlagusGSON {
  private static PlagusGSON instance;
  private static Gson internalGson;

  private PlagusGSON() {
    internalGson = new GsonBuilder()
            .registerTypeAdapter(Path.class, new PathDeserializer())
            .registerTypeAdapter(Token.class, new GsonToken())
            .disableHtmlEscaping()
            .setPrettyPrinting()
            .create();
  }

  ;

  /**
   * Gets instance.
   *
   * @return the instance
   */
  public static PlagusGSON getInstance() {
    if (instance == null) {
      instance = new PlagusGSON();
    }
    return instance;
  }

  /**
   * To gs string string.
   *
   * @param <T>   the type parameter
   * @param obj   the obj
   * @param clazz the clazz
   * @return the string
   */
  public <T> String toGsString(Object obj, Class<T> clazz) {
    return internalGson.toJson(obj, clazz);
  }
}
