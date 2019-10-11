package com.mkdlp.designpatterns.date20191010.adapter.Practice;

public class Center implements Player {
    @Override
    public void attack() {
        System.out.println("中锋进攻");
    }

    @Override
    public void defence() {
        System.out.println("中锋防守");
    }
}
