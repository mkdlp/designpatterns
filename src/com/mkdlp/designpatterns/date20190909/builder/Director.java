package com.mkdlp.designpatterns.date20190909.builder;

public class Director {

    public Product buildProduct(IBuilder builder){
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
        return builder.buildProduct();
    }
}
