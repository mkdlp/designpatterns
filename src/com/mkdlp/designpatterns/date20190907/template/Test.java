package com.mkdlp.designpatterns.date20190907.template;

public class Test {
    public static void main(String[] args) {
        House1 h1=new House1();
        House2 h2=new House2(false);
        h1.buildHouse();
        h2.buildHouse();
    }
}
