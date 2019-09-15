package com.mkdlp.designpatterns.date20190904.factorymesthod;

public class Test {

    public static void main(String[] args) {
        Factory fa=new FactoryA();
        Product a=fa.productFactory();
        a.productDesc();
        Factory fb=new FactoryB();
        Product b=fb.productFactory();
        b.productDesc();
        Factory fc=new FactoryC();
        Product c=fc.productFactory();
        c.productDesc();
    }
}
