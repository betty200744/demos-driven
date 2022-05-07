package com.cc.autovalue.withjackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;

@AutoValue
@JsonSerialize(as = Person.class)
@JsonDeserialize(builder = Person.Builder.class)
public abstract class Person {
  @JsonProperty("id")
  public abstract Integer id();
  
  @JsonProperty("name")
  public abstract String name();
  
  public static Person create(Integer id, String name) {
    return builder()
        .id(id)
        .name(name)
        .build();
  }
  
  public static Builder builder() {
    return Builder.builder();
  }
  
  @AutoValue.Builder
  @JsonIgnoreProperties(ignoreUnknown = true)
  public abstract static class Builder {
    @JsonCreator
    public static Builder builder() {
      return new AutoValue_Person.Builder();
    }
    
    @JsonProperty("id")
    public abstract Builder id(Integer id);
    
    @JsonProperty("name")
    public abstract Builder name(String name);
    
    public abstract Person build();
  }
}
