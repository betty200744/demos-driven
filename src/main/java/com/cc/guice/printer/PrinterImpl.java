package com.cc.guice.printer;

public class PrinterImpl implements Printer {
    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }
}
