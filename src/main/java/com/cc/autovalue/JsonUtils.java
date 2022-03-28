package com.cc.autovalue;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Map;

public class JsonUtils {
  public static final Gson GSON = new GsonBuilder().create();
  
  private JsonUtils() {
  }
  
  /**
   * Convert a Map to JSON string
   *
   * @param map Map
   * @return JSON string
   */
  public static String convertMapToJson(Map<String, String> map) {
    return GSON.toJson(map);
  }
  
  public static String toJson(Object o) {
    return GSON.toJson(o);
  }
  
  public static <T> T fromJson(final String json, Class<T> type) {
    return GSON.fromJson(json, type);
  }
}