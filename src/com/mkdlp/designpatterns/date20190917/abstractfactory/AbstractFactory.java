package com.mkdlp.designpatterns.date20190917.abstractfactory;

public class AbstractFactory {

    public static void main(String[] args) {
        Food a = new ProducerA().getFood();
        Food b = new ProducerB().getFood();
    }
}
