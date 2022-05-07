package com.cc.guice.helloname;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

class HelloModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(IHelloPrinter.class).annotatedWith(Names.named("simple")).to(SimpleHelloPrinter.class);
    bind(IHelloPrinter.class).annotatedWith(Names.named("complex")).to(ComplexHelloPrinter.class);
  }
}
