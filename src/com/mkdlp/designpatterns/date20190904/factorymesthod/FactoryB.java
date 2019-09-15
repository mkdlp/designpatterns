package com.mkdlp.designpatterns.date20190904.factorymesthod;

public class FactoryB implements Factory{
    @Override
    public Product productFactory() {
        return new ProductB();
    }
}
