package com.mkdlp.designpatterns.date20191011.Memento.whitecase;

public class Test {
    public static void main(String[] args) {
        Originator o=new Originator();
        o.setState("on");
        o.show();

        Caretaker c=new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("off");
        o.show();

        o.setMemento(c.getMemento());
        o.show();
    }
}
