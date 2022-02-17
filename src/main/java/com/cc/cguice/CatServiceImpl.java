package com.cc.cguice;

public class CatServiceImpl implements AnimalService {

    @Override
    public void jump() {
        System.out.println("cat service, method: jump");
    }
}
