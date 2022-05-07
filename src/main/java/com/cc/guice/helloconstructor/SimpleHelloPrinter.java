package com.cc.guice.helloconstructor;

import com.google.inject.Singleton;

@Singleton
class SimpleHelloPrinter implements IHelloPrinter {
  
  public void print() {
    System.out.println("hello, SimpleHelloPrinter ");
    
  }
}
