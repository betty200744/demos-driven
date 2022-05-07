package com.cc.guice.helloworld;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;

@Singleton
public class HelloWorld {
  
  // field inject
  @Inject
  private HelloPrinter helloPrinter;
  @Inject
  private HelloPrinterNotSingleton helloPrinterNotSingleton;
  @Inject
  private HelloPrinter helloPrinter1;
  @Inject
  private HelloPrinterNotSingleton helloPrinterNotSingleton1;
  
  public void hello() {
    helloPrinter.print();
    helloPrinter1.print();
  }
  
  public void helloNotSingleton() {
    helloPrinterNotSingleton.print();
    helloPrinterNotSingleton1.print();
  }
  
  public static void main(String[] args) {
    Injector injector = Guice.createInjector();
    HelloWorld helloWorld = injector.getInstance(HelloWorld.class);
    helloWorld.hello();
    helloWorld.helloNotSingleton();
  }
}
