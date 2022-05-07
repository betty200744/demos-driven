package com.cc.autovalue.withgson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class GsonUtils {
  public static final Gson GSON = new GsonBuilder().create();
  
  public static String toJsonString(Object o) {
    return GSON.toJson(o);
  }
  
  public static <T> T fromJsonString(final String json, Class<T> type) {
    return GSON.fromJson(json, type);
  }
  
}
