package com.mkdlp.designpatterns.date20191025.mediator.simplemode;

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague() {
    }

    public Colleague(Mediator mediator){
        this.mediator=mediator;
    }

    public abstract void notify(String message);

    public abstract void send(String messag);
}
