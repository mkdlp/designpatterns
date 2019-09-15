package com.mkdlp.designpatterns.date20190907.facade;

public class Facade {

    private SubSystemA a;
    private SubSystemB b;
    private SubSystemC c;
    private SubSystemD d;

    public Facade() {
        this.a = new SubSystemA();
        this.b = new SubSystemB();
        this.c = new SubSystemC();
        this.d = new SubSystemD();
    }

    public void methodGroupA(){
        System.out.println("方法组合A");
        a.MethodA();
        b.MethodB();
    }

    public void methodGroupB(){
        System.out.println("方法组合B");
        c.MethodC();
        d.MethodD();
    }
}
