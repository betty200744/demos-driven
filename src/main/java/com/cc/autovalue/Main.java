package com.cc.autovalue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    
    String ps = "{\"name\":\"betty\"}";
    
    // jackson, json to object
    Person p1 = JacksonUtils.fromJson(ps, Person.class);
    System.out.println(p1.name());
    
    // gson, json to object
    Person p2 = JsonUtils.fromJson(ps, AutoValue_Person.class);
    System.out.println(p2.name());
    
    // object to json
    Person p3 = Person.create("aaa");
    System.out.println(JsonUtils.toJson(p3));
    
    // string map to json
    Map<String, String> stringStringMap = new HashMap<>();
    stringStringMap.put("name", "mmmmm");
    System.out.println(JsonUtils.convertMapToJson(stringStringMap));
  }
}