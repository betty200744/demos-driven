package com.cc.guice.animal;


import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {
    public static void main(String[] args) {
        System.out.println("this is compass juice demo~~");
        Injector injector = Guice.createInjector(new AnimalModule());
        Animal animal = injector.getInstance(Animal.class);
        animal.jump();
    }
}
