package com.cc.autovalue.withjackson;


import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    String betty = "{\"id\":1,\"name\":\"betty\"}";
    Person p1 = JacksonUtils.fromJsonString(betty, AutoValue_Person.class);
    System.out.println(p1);
    Person p2 = Person.create(2, "cc");
    System.out.println(p2.toString());
  }
}