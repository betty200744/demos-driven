package com.cc.autovalue;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JacksonUtils {
  private static final ObjectMapper JSON_MAPPER = new ObjectMapper();
  /**
   * Convert JSON string to the given Class type
   *
   * @param json JSON string
   * @param type Class
   * @param <T>  Type param
   * @return A well formed Java object
   * @throws IOException
   */
  public static <T> T fromJson(final String json, Class<T> type) throws IOException {
    return JSON_MAPPER.readValue(json, type);
  }
}
