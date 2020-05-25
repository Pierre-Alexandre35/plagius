package com.plagus_server.util;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.nio.file.Path;

/**
 * The type Path deserializer for gson.
 */
public class PathDeserializer implements JsonDeserializer<Path> {


  @Override
  public Path deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
    return Path.of(json.getAsString());
  }
}
