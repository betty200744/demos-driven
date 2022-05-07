package com.cc.guice.helloprovides;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;


public class BillingModule extends AbstractModule {
  @Override
  protected void configure() {
  }
  
  @Provides
  static TransactionLog provideTransactionLog() {
    DatabaseTransactionLog transactionLog = new DatabaseTransactionLog();
    transactionLog.setJdbcUrl("jdbc:mysql://localhost/pizza");
    return transactionLog;
  }
}