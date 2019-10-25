package com.mkdlp.designpatterns.date20191025.mediator.simplemode;

public class Colleague1 extends Colleague {

    public Colleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("同事1收到消息："+message);
    }

    @Override
    public void send(String messag) {
        mediator.send(messag,this);
    }
}
