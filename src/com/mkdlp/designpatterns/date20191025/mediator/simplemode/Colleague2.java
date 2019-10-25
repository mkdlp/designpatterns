package com.mkdlp.designpatterns.date20191025.mediator.simplemode;

public class Colleague2 extends Colleague {

    public Colleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("同事2收到消息："+message);
    }

    @Override
    public void send(String messag) {
        mediator.send(messag,this);
    }
}
