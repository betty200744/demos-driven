package com.cc.cguice;


import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        System.out.println("this is compass juice demo~~");
        // injector with module, module that bind CatServiceImpl
        Injector injector = Guice.createInjector(new AnimalModule());
        // injector get instance
        AnimalService animalService = injector.getInstance(AnimalService.class);
        animalService.jump();
    }
}
