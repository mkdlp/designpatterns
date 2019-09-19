package com.mkdlp.designpatterns.date20190917.abstractfactory;

public class ProducerA implements Producer {

    @Override
    public Food getFood() {
        return new FoodA();
    }
}
