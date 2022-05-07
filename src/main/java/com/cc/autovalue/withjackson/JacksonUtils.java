package com.cc.autovalue.withjackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JacksonUtils {
  private static final ObjectMapper JSON_MAPPER = new ObjectMapper();
  
  public static <T> T fromJsonString(final String json, Class<T> type) throws IOException {
    return JSON_MAPPER.readValue(json, type);
  }
}
