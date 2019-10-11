package com.mkdlp.designpatterns.date20191010.adapter.objectadapter;



public class Test {

    public static void main(String[] args) {
        Target tar=new Adapter(new Adaptee());
        tar.request1();
        tar.request2();
    }
}
