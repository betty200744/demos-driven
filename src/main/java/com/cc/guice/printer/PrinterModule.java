package com.cc.guice.printer;

import com.google.inject.AbstractModule;

public class PrinterModule extends AbstractModule {
    // instance Bindings
    // bind interface to instance
    @Override
    protected void configure() {
        Printer myPrinter = new PrinterImpl();
        bind(Printer.class).toInstance(myPrinter);
    }
}
