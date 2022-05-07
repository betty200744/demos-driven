package com.cc.gson;

import com.google.auto.value.AutoValue;

/*
 * Review
 * */
@AutoValue
public abstract class Review {
    public abstract String title();
    
    public abstract int price();
    
    public Review() {
    }
    
    public static Review create(String title, int price) {
        return builder()
            .price(price)
            .title(title)
            .build();
    }
    
    public static Builder builder() {
        return new AutoValue_Review.Builder();
    }
    
    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder price(int price);
        
        public abstract Builder title(String title);
        
        public abstract Review build();
    }
}
