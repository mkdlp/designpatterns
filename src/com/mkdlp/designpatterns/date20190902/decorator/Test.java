package com.mkdlp.designpatterns.date20190902.decorator;

public class Test {

    public static void main(String[] args) {
        Component cxk=new ConcreteComponent();
        cxk.doSomething();
        Decorator d_cxk=new ConcreteDecorator(cxk);
        d_cxk.doSomething();
    }
}
