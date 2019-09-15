package com.mkdlp.designpatterns.date20190904.factorymesthod;

public class FactoryA implements Factory{
    @Override
    public Product productFactory() {
        return new ProductA();
    }
}
