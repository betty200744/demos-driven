package com.cc.guice.printer;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class App {
    public static void main(String[] args) {
        // Guice.createInjector takes one or more modules, and returns a new Injector instance
        Injector injector = Guice.createInjector(new PrinterModule(), new MessageModule());
        // Now that we've got the injector, we can build objects
        Service service = injector.getInstance(Service.class);
        service.run();
    }
}
