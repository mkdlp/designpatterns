package com.mkdlp.designpatterns.date20191010.adapter.classadapter;

public class Adapter  extends Adaptee implements Target  {

    @Override
    public void request2() {
        System.out.println("适配器请求");
    }
}
