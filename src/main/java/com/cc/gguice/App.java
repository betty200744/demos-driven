package com.cc.gguice;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class App {
    private final Printer printer;
    private final String message;

    // @Inject annotation marks this constructor as eligible to be used by Guice
    @Inject
    App(Printer printer, @Message String message) {
        this.printer = printer;
        this.message = message;
    }

    public static void main(String[] args) {
        // Guice.createInjector takes one or more modules, and returns a new Injector instance
        Injector injector = Guice.createInjector(new PrinterModule(), new MessageModule());
        // Now that we've got the injector, we can build objects
        App app = injector.getInstance(App.class);
        app.run();
    }

    public void run() {
        printer.printMessage(message);
    }
}
