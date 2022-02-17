package com.cc.gguice;

public class PrinterImpl implements Printer {
    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }
}
