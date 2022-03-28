package com.cc.gson;

/*
 * Review
 * */
public class Review {
    private String title;
    private int price;

    public Review(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public void detail() {
        System.out.println(this.title + ", price is " + this.price);
    }

    public int getPrice() {
        return this.price;
    }

}
