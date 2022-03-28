package com.cc.guice.printer;

import com.google.inject.Inject;

public class Service  {
  private final Printer printer;
  private final String message;
  
  // @Inject annotation marks this constructor as eligible to be used by Guice
  @Inject
  Service(Printer printer, @Message String message) {
    this.printer = printer;
    this.message = message;
  }
  public void run() {
    printer.printMessage(message);
  }
}
