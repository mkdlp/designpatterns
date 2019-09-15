package com.mkdlp.designpatterns.date20190907.prototype.simpleclone;

public class Test {

    public static void main(String[] args) {
        Person p1=new Person();

        Person p2=p1.clone();

        System.out.println("p1:"+p1);
        System.out.println("p2:"+p2);
        System.out.println("p1=p2?:"+(p1==p2));

        Person p3=new Person();
        Person p4=p3;
        System.out.println("p3:"+p3);
        System.out.println("p4:"+p4);
        System.out.println("p3=p4?:"+(p3==p4));
    }
}
