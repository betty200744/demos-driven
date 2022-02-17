package com.cc.gguice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class MessageModule extends AbstractModule {
    // MessageModule that provides bindings for message
    // @Provides, to specify the dependencies
    // @Message
    @Provides
    @Message
    String provideMessage() {
        return "this is google guice demo~~~";
    }
}
