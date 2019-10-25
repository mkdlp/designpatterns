package com.mkdlp.designpatterns.date20191025.mediator.simplemode;

public class ConcreteMediator implements Mediator{

    private Colleague colleague1;

    private Colleague colleague2;

    public Colleague getColleague1() {
        return colleague1;
    }

    @Override
    public void setColleague1(Colleague colleague1) {
        this.colleague1 = colleague1;
    }

    public Colleague getColleague2() {
        return colleague2;
    }

    @Override
    public void setColleague2(Colleague colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if(colleague == colleague1){
            colleague2.notify(message);
        }else{
            colleague1.notify(message);
        }
    }
}
