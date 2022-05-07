package com.cc.guice.helloannotation;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

// App > CreditCardProcessor.class > CreditCardProcessorModule > GreeterModule > Provides @PayPalCreditCardProcessor @PayPal
public class Order {
  
  @Inject
  @PayPal
  CreditCardProcessor processor;
  
  public void pay(Integer money) {
    processor.pay(money);
  }
  
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(
        new CreditCardProcessorModule()
    );
    
    Order order = injector.getInstance(Order.class);
    order.pay(33);
  }
}
