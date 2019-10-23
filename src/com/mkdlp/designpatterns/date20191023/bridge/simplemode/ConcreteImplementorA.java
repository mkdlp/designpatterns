package com.mkdlp.designpatterns.date20191023.bridge.simplemode;

public class ConcreteImplementorA implements Implmentor {

    @Override
    public void operation() {
        System.out.println("具体实现A的执行方法");
    }
}
