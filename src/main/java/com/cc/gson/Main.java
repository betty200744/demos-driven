package com.cc.gson;

import com.google.common.reflect.TypeToken;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final Gson GSON = new GsonBuilder().create();
    
    public static void main(String[] args) {
        System.out.println("this is gson demo !!");
        //---------------obj---------------
        Review review = Review.create("review1", 1);
        // toJsonString
        String reviewJsonString = GSON.toJson(review);
        System.out.println("toJsonString: " + reviewJsonString);
        // fromJsonString
        Review review2 = GSON.fromJson(reviewJsonString, AutoValue_Review.class);
        System.out.println("fromJsonString:   " + review2);
        
        //---------------obj array---------------
        ArrayList<Review> reviews = new ArrayList<>();
        reviews.add(Review.create("r1", 1));
        reviews.add(Review.create("r2", 2));
        // toJsonString
        String reviewsJsonString = GSON.toJson(reviews);
        System.out.println("List toJsonString: " + reviewsJsonString);
        // fromJsonString
        Type ReviewList = new TypeToken<ArrayList<AutoValue_Review>>() {
        }.getType();
        List<Review> reviewList = GSON.fromJson(reviewsJsonString, ReviewList);
        for (Review r : reviewList) {
            System.out.println("List fromJsonString : " + r);
        }
    }
}
