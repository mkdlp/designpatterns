package com.mkdlp.designpatterns.date20191010.adapter.classadapter;

public class Test {

    public static void main(String[] args) {
        Target tar=new Adapter();
        tar.request1();
        tar.request2();
    }
}
