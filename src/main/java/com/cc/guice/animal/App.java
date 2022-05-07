package com.cc.guice.animal;


import com.google.inject.Guice;
import com.google.inject.Injector;

// demo:
// create injectors with module that configure   the instance Bindings

// Instance Bindings is the bind interface to impl

// then we can get instance by injector

// App > Animal.class > AnimalModule > CatServiceImpl > jump
public class App {
    public static void main(String[] args) {
        System.out.println("this is compass juice demo~~");
        // create injector with Modules
        Injector injector = Guice.createInjector(new AnimalModule());
        // only the instance by guice injector
        Animal animal = injector.getInstance(Animal.class);
        animal.jump();
    }
}
