package com.mkdlp.designpatterns.date20191025.mediator.simplemode;

public class Client {

    public static void main(String[] args) {
        Mediator mediator=new ConcreteMediator();

        Colleague c1=new Colleague1(mediator);

        Colleague c2=new Colleague2(mediator);

        mediator.setColleague1(c1);
        mediator.setColleague2(c2);

        c1.send("c2你收到了没");
        c2.send("c1你收到了没");
    }
}
