package com.mkdlp.designpatterns.date20191023.bridge.simplemode;

public class ConcreteImplementorB implements Implmentor {

    @Override
    public void operation() {
        System.out.println("具体实现B的执行方法");
    }
}
