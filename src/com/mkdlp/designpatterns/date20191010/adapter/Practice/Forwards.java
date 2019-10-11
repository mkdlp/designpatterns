package com.mkdlp.designpatterns.date20191010.adapter.Practice;

public class Forwards implements Player {
    @Override
    public void attack() {
        System.out.println("前锋进攻");
    }

    @Override
    public void defence() {
        System.out.println("前锋防守");
    }
}
