package com.mkdlp.designpatterns.date20191025.mediator.simplemode;

public interface Mediator {

    void send(String message,Colleague colleague);

    void setColleague1(Colleague colleague);

    void setColleague2(Colleague colleague);
}
