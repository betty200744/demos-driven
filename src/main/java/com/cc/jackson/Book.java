package com.cc.jackson;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(as = Book.class)
public class Book {
  public long id;
  public String name;
  @JsonSerialize(as = Person.class)
  public Person author;

  public Book(long id, String name, Person author) {
    this.id = id;
    this.name = name;
    this.author = author;
  }
}
