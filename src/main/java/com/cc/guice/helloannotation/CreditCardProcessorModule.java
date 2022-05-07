package com.cc.guice.helloannotation;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class CreditCardProcessorModule extends AbstractModule {
  
  @Provides
  @PayPal
  CreditCardProcessor providePayPalCreditCardProcessor(
      @ApiKey String apiKey) {
    PayPalCreditCardProcessor processor = new PayPalCreditCardProcessor();
    processor.setApiKey(apiKey);
    return processor;
  }
  
  @ApiKey
  @Provides
  static String provideApiKey() {
    return "api key";
  }
}
