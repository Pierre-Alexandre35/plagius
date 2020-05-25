package com.plagus_server.util;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;

import java.lang.reflect.Type;

/**
 * The type Gson token.
 */
public class GsonToken implements JsonSerializer<Token>, JsonDeserializer<Token> {

  @Override
  public Token deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {


    return new Token() {
      @Override
      public String getText() {
        return json.getAsJsonObject().get("text").toString();


      }

      @Override
      public int getType() {
        return json.getAsJsonObject().get("type").getAsInt();

      }

      @Override
      public int getLine() {
        return json.getAsJsonObject().get("line").getAsInt();

      }

      @Override
      public int getCharPositionInLine() {
        return json.getAsJsonObject().get("col").getAsInt();

      }

      @Override
      public int getChannel() {
        return -1;

      }

      @Override
      public int getTokenIndex() {
        return -1;

      }

      @Override
      public int getStartIndex() {
        return json.getAsJsonObject().get("start-index").getAsInt();

      }

      @Override
      public int getStopIndex() {
        return json.getAsJsonObject().get("stop-index").getAsInt();

      }

      @Override
      public TokenSource getTokenSource() {
        return null;
      }

      @Override
      public CharStream getInputStream() {
        return null;
      }
    };
  }

  @Override
  public JsonElement serialize(Token src, Type typeOfSrc, JsonSerializationContext context) {
    var json = new JsonObject();

    json.add("text", new JsonPrimitive(src.getText()));
    json.add("type", new JsonPrimitive(src.getType()));
    json.add("line", new JsonPrimitive(src.getLine()));
    json.add("col", new JsonPrimitive(src.getCharPositionInLine()));
    json.add("start-index", new JsonPrimitive(src.getStartIndex()));
    json.add("stop-index", new JsonPrimitive(src.getStopIndex()));

    return json;
  }
}
