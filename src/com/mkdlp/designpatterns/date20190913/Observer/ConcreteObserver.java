package com.mkdlp.designpatterns.date20190913.Observer;

public class ConcreteObserver implements Observer {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("观察者:"+this.name+"收到消息！");
    }
}
