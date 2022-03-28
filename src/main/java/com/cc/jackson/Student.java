package com.cc.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
  @JsonProperty("id")
  public int id;
  @JsonProperty("name")
  public String name;

  @JsonCreator
  public Student(@JsonProperty("id") int id, @JsonProperty("name") String name) {
    this.id = id;
    this.name = name;
  }
}
