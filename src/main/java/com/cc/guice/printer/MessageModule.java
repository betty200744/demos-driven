package com.cc.guice.printer;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class MessageModule extends AbstractModule {
    // Provider Bindings with @Message annotations
    @Provides
    @Message
    String provideMessage() {
        return "this is google guice demo~~~";
    }
}
