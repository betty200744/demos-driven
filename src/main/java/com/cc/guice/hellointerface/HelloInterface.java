package com.cc.guice.hellointerface;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;

// HelloInterface.class > hello > HelloModule > ComplexHelloPrinter
@Singleton
public class HelloInterface {
  
  @Inject
  private IHelloPrinter helloPrinter;
  
  public void hello() {
    helloPrinter.print();
  }
  
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new HelloModule());
    HelloInterface helloInterface = injector.getInstance(HelloInterface.class);
    helloInterface.hello();
  }
}
