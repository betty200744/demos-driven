package com.cc.guice.greeter;

import com.google.inject.Guice;
import com.google.inject.Injector;

// App > Greeter.class > sayHello > GreeterModule > Provides @Message @Count
public class App {
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(
        new GreeterModule()
    );
    Greeter greeter = injector.getInstance(Greeter.class);
    greeter.sayHello();
  }
}
