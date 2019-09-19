package com.mkdlp.designpatterns.date20190909.builder.innerclass;

public class Test {

    public static void main(String[] args) {
        ConcreteBuilder builder=new ConcreteBuilder();
        Product product=builder
                .buildA("香辣鸡腿堡")
                .buildB("大可")
                .buildC("大薯")
                .buildD("圣代")
                .build();
        System.out.println(product);
    }
}
