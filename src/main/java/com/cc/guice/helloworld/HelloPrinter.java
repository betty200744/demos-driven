package com.cc.guice.helloworld;

import com.google.inject.Singleton;

@Singleton
class HelloPrinter {
  
  public void print() {
    System.out.println("hello, HelloPrinter " + this);
    
  }
}
