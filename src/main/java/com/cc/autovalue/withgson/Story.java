package com.cc.autovalue.withgson;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Story {
  public abstract Integer id();
  
  public abstract String title();
  
  public static Story create(Integer id, String title) {
    return builder()
        .id(id)
        .title(title)
        .build();
  }
  
  public static Builder builder() {
    return new AutoValue_Story.Builder();
  }
  
  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder id(Integer id);
    
    public abstract Builder title(String title);
    
    public abstract Story build();
  }
}
