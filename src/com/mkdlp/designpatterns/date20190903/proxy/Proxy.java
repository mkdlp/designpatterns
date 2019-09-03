package com.mkdlp.designpatterns.date20190903.proxy;

public class Proxy implements Subject {

    Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("代理类增强");
        subject.request();
    }
}

