package com.cc.guice.helloprovides;

public class DatabaseTransactionLog implements TransactionLog {
  private String jdbcUrl;
  
  @Override
  public void setJdbcUrl(String url) {
    this.jdbcUrl = url;
  }
  
  @Override
  public String getJdbcUrl() {
    return jdbcUrl;
  }
}
