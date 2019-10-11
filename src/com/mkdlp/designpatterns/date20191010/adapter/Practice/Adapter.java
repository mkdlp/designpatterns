package com.mkdlp.designpatterns.date20191010.adapter.Practice;

public class Adapter implements Player {

    private ForeignCenter fm;

    public Adapter(ForeignCenter fm) {
        this.fm = fm;
    }

    @Override
    public void attack() {
        fm.attack();
    }

    @Override
    public void defence() {
        fm.defence();
    }
}
