package com.cc.guice.greeter;

import com.google.inject.Inject;

public class Greeter {
  private final String message;
  private final int count;
  
  @Inject
  public Greeter(@Message String message, @Count int count) {
    this.message = message;
    this.count = count;
  }
  
  void sayHello() {
    for (int i = 0; i < count; i++) {
      System.out.println(message);
    }
  }
}
