package com.mkdlp.designpatterns.date20191010.adapter.Practice;

public class Guards implements Player {
    @Override
    public void attack() {
        System.out.println("后卫进攻");
    }

    @Override
    public void defence() {
        System.out.println("后卫防守");
    }
}
