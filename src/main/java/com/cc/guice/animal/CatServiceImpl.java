package com.cc.guice.animal;

public class CatServiceImpl implements Animal {

    @Override
    public void jump() {
        System.out.println("CatServiceImpl, method: jump");
    }
}
