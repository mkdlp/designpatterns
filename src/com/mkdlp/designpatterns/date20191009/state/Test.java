package com.mkdlp.designpatterns.date20191009.state;

public class Test {
    public static void main(String[] args) {
        Context c=new Context(new StateA());

        c.request();
        c.request();
        c.request();
        c.request();
        c.request();
    }
}
