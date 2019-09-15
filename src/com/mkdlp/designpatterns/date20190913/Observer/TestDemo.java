package com.mkdlp.designpatterns.date20190913.Observer;

public class TestDemo {
    public static void main(String[] args) {
        Observer ob1=new ConcreteObserver("mkdlp");
        Observer ob2=new ConcreteObserver("ace");

        Subject sb1=new ConcreteSubject();
        sb1.addObserver(ob1);
        sb1.addObserver(ob2);
        sb1.notifyObserver();
    }
}
