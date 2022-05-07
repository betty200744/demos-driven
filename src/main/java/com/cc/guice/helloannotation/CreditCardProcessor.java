package com.cc.guice.helloannotation;

public interface CreditCardProcessor {
  void setApiKey(String key);
  
  void pay(Integer money);
}
