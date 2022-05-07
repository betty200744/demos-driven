package com.cc.guice.helloprovides;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;

// HelloProvides.class > getJdbcUrl > BillingModule > Provides DatabaseTransactionLog
@Singleton
public class HelloProvides {
  
  @Inject
  private TransactionLog transactionLog;
  
  public String getJdbcUrl() {
    return transactionLog.getJdbcUrl();
  }
  
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new BillingModule());
    HelloProvides helloProvides = injector.getInstance(HelloProvides.class);
    System.out.println(helloProvides.getJdbcUrl());
  }
}
