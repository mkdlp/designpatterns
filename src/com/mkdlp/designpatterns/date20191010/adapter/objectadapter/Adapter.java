package com.mkdlp.designpatterns.date20191010.adapter.objectadapter;

public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request1(){
        this.adaptee.request1();
    }

    @Override
    public void request2(){
        System.out.println("适配器方法");
    }
}
