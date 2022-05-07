package com.cc.guice.helloname;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

// HelloName.class > hello > HelloModule > SimpleHelloPrinter and ComplexHelloPrinter
@Singleton
public class HelloName {
  
  // field inject
  @Named("simple")
  @Inject
  private IHelloPrinter simplePrinter;
  
  @Named("complex")
  @Inject
  private IHelloPrinter complexPrinter;
  
  
  public void hello() {
    simplePrinter.print();
    complexPrinter.print();
  }
  
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new HelloModule());
    HelloName helloWorld = injector.getInstance(HelloName.class);
    helloWorld.hello();
  }
}
