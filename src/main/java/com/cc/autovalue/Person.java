package com.cc.autovalue;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;

@AutoValue
@JsonSerialize(as = Person.class)
@JsonDeserialize(builder = Person.Builder.class)
public abstract class Person {
  //  json serialize
  @JsonProperty("name")
  public abstract String name();
  
  public static Person create(String name) {
    return builder()
        .name(name)
        .build();
  }
  
  
  public static Builder builder() {
    return new AutoValue_Person.Builder();
  }
  
  //  json deserialize
  @AutoValue.Builder
  public abstract static class Builder {
    @JsonProperty("name")
    public abstract Builder name(String name);
    
    public abstract Person build();
    
    @JsonCreator
    public static Builder builder() {
      return new AutoValue_Person.Builder();
    }
  }
}
