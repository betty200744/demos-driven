package com.cc.cannotations;

public class Main {
  public static void main(String[] args) throws Exception {
    Person person = new Person("soufiane", "cheouati", "34");
    ObjectToJsonConverter serializer = new ObjectToJsonConverter();
    String jsonString = serializer.convertToJson(person);
    System.out.println(jsonString);
  }
}
