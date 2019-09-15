package com.mkdlp.designpatterns.date20190904.factorymesthod;

public class FactoryC implements Factory{
    @Override
    public Product productFactory() {
        return new ProductC();
    }
}
