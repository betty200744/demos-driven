package com.cc.guice.hellointerface;

import com.google.inject.Singleton;

@Singleton
class ComplexHelloPrinter implements IHelloPrinter {
  
  public void print() {
    System.out.println("Hello, ComplexHelloPrinter");
  }
  
}
