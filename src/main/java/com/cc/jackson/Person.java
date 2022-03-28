package com.cc.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(as = Person.class)
public class Person {
    @JsonProperty("name")
    private String name;
    @JsonProperty("addr")
    private String addr;
    @JsonProperty("phone")
    private String phone;

    public Person(String name, String addr, String phone) {
        this.name = name;
        this.addr = addr;
        this.phone = phone;
    }
}
