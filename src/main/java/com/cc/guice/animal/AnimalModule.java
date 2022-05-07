package com.cc.guice.animal;

import com.google.inject.AbstractModule;

// configuring the injector using modules
public class AnimalModule extends AbstractModule {
    protected void configure() {
        // instance Bindings, bind interface to impl
        bind(Animal.class).to(CatServiceImpl.class);
    }
}
