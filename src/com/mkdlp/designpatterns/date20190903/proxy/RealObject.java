package com.mkdlp.designpatterns.date20190903.proxy;

public class RealObject implements Subject {

    @Override
    public void request() {
        System.out.println("真正的请求!");
    }
}
