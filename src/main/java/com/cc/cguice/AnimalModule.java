package com.cc.cguice;

import com.google.inject.AbstractModule;

public class AnimalModule extends AbstractModule {
    protected void configure() {
        bind(AnimalService.class).to(CatServiceImpl.class);
    }
}
