package com.cc.guice.animal;

public class CatServiceImpl implements Animal {

    @Override
    public void jump() {
        System.out.println("cat service, method: jump");
    }
}
