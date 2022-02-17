package com.cc.gguice;

import com.google.inject.AbstractModule;

public class PrinterModule extends AbstractModule {
    // configure,  bind Printer to myPrinter instance
    @Override
    protected void configure() {
        Printer myPrinter = new PrinterImpl();
        bind(Printer.class).toInstance(myPrinter);
    }
}
