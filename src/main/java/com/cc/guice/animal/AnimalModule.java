package com.cc.guice.animal;

import com.google.inject.AbstractModule;

public class AnimalModule extends AbstractModule {
    protected void configure() {
        // instance Bindings
        bind(Animal.class).to(CatServiceImpl.class);
    }
}
