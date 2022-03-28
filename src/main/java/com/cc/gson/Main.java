package com.cc.gson;

import com.google.gson.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("this is gson demo !!");
        //---------------obj---------------
        Review review = new Review("review1", 1);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // to json string
        String reviewJsonString = gson.toJson(review);
        System.out.println(reviewJsonString);
        // from string
        Review review2 = gson.fromJson(reviewJsonString, Review.class);
        System.out.println(review2.hashCode());

        //---------------obj array---------------
        ArrayList<Review> reviews = new ArrayList<>();
        reviews.add(new Review("r1", 1));
        reviews.add(new Review("r2", 2));
        reviews.add(new Review("r3", 3));
        String reviewsJsonString = gson.toJson(reviews);
        System.out.println(reviewsJsonString);

        //---------------hashMap---------------
        HashMap<String, String> reviewMap = new HashMap<>();
        reviewMap.put("rw1", "1");
        reviewMap.put("rw2", "2");
        reviewMap.put("rw3", "3");
        String reviewMapJsonString = gson.toJson(reviewMap);
        System.out.println(reviewMapJsonString);
    }
}
