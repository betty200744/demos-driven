package com.cc.guice.helloconstructor;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.name.Named;


// HelloConstructor.class > hello > HelloModule > SimpleHelloPrinter and ComplexHelloPrinter
@Singleton
public class HelloConstructor {
  
  private IHelloPrinter simplePrinter;
  private IHelloPrinter complexPrinter;
  
  @Inject
  public HelloConstructor(@Named("simple") IHelloPrinter simplePrinter, @Named("complex") IHelloPrinter complexPrinter) {
    this.simplePrinter = simplePrinter;
    this.complexPrinter = complexPrinter;
  }
  
  public void hello() {
    simplePrinter.print();
    complexPrinter.print();
  }
  
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(
        new HelloModule()
    );
    HelloConstructor helloConstructor = injector.getInstance(HelloConstructor.class);
    helloConstructor.hello();
  }
}
