package com.mkdlp.designpatterns.date20191023.bridge.simplemode;

public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation(){
        implmentor.operation();
    }
}
