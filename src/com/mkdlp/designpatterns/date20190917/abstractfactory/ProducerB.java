package com.mkdlp.designpatterns.date20190917.abstractfactory;

public class ProducerB implements Producer {

    @Override
    public Food getFood() {
        return new FoodB();
    }
}
