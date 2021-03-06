package com.cc.guice.greeter;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// @interface is an annotation type definition
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@interface Message {}
