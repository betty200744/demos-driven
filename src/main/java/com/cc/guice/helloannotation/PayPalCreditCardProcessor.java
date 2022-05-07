package com.cc.guice.helloannotation;

public class PayPalCreditCardProcessor implements CreditCardProcessor {
  
  @Override
  public void setApiKey(String key) {
  
  }
  
  @Override
  public void pay(Integer money) {
    System.out.println("PayPalCreditCardProcessor pay  " + money);
  }
}
