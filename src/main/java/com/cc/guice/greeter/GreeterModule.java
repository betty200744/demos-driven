package com.cc.guice.greeter;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class GreeterModule extends AbstractModule {
  
  @Override
  protected void configure() {
  
  }
  
  // bind(Integer.class).annotatedWith(Count.class).toInstance(3);
  // bindConstant().annotatedWith(Count.class).to(3);
  // provider binding
  @Provides
  @Count
  static Integer provideCount() {
    return 3;
  }
  
  // bind(String.class).annotatedWith(Message.class).toInstance("hello");
  // bindConstant().annotatedWith(Message.class).to("hello");
  // provider binding
  @Provides
  @Message
  static String provideMessage() {
    return "hello";
  }
}
