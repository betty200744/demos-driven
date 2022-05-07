package com.cc.guice.greeter;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class GreeterModule extends AbstractModule {
  
  @Override
  protected void configure() {
//    bind(Integer.class).annotatedWith(Count.class).toInstance(3);
//    bindConstant().annotatedWith(Count.class).to(3);
//    bind(String.class).annotatedWith(Message.class).toInstance("hello");
//    bindConstant().annotatedWith(Message.class).to("hello");
  }
  
  // provider binding, binding the Integer.class to Instance 3 with annotation "Count.class"
  // alternative：
  //    * bind(Integer.class).annotatedWith(Count.class).toInstance(3);
  //    * bindConstant().annotatedWith(Count.class).to(3);
  @Count
  @Provides
  static Integer provideCount() {
    return 3;
  }
  
  
  // provider binding, binding the Sting.class to Instance "hello" with annotation "Message.class"
  // alternative：
  //      * bind(String.class).annotatedWith(Message.class).toInstance("hello");
  //      * bindConstant().annotatedWith(Message.class).to("hello");
  @Message
  @Provides
  static String provideMessage() {
    return "hello";
  }
}
