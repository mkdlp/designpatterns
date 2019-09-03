package com.mkdlp.designpatterns.date20190903.proxy;

public class Test {

    public static void main(String[] args) {
        RealObject real=new RealObject();
        real.request();

        Proxy proxy=new Proxy(real);
        proxy.request();
    }
}
