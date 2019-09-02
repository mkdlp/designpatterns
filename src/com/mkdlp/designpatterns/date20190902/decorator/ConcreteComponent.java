package com.mkdlp.designpatterns.date20190902.decorator;

public class ConcreteComponent implements Component {

    @Override
    public void doSomething() {
        System.out.println("吃饭睡觉打豆豆");
    }
}
