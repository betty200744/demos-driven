package com.cc.guice.hellointerface;

import com.google.inject.AbstractModule;

class HelloModule extends AbstractModule {
  @Override
  protected void configure() {
//    bind(IHelloPrinter.class).to(SimpleHelloPrinter.class);
    bind(IHelloPrinter.class).to(ComplexHelloPrinter.class);
  }
}
