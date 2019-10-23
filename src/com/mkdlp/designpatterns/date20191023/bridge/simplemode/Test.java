package com.mkdlp.designpatterns.date20191023.bridge.simplemode;

public class Test {

    public static void main(String[] args) {
        Abstraction ab=new Abstraction();
        ab.setImplmentor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplmentor(new ConcreteImplementorB());
        ab.operation();


    }
}
