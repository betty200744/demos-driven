package com.cc.guice.helloannotation;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// @interface is an annotation type definition
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@interface PayPal {}
