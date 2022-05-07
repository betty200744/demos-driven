package com.cc.guice.helloprovides;

public interface TransactionLog {
    void setJdbcUrl(String url);
    String getJdbcUrl();
}
