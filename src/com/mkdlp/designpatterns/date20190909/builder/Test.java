package com.mkdlp.designpatterns.date20190909.builder;

public class Test {

    public static void main(String[] args) {
        Director dr=new Director();
        Product product=dr.buildProduct(new Builder1());
        System.out.println(product);
    }


}
