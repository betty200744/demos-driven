package com.cc.guice.greeter;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// annotations
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@interface Message {}
