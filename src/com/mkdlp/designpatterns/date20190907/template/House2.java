package com.mkdlp.designpatterns.date20190907.template;

public class House2 extends HouseTemplate {

    public boolean isBuildWardrobe;

    public House2(boolean isBuildWardrobe) {
        this.isBuildWardrobe = isBuildWardrobe;
    }

    @Override
    public void buildWardrobe() {
        System.out.println("安装木衣柜");
    }

    @Override
    public void buildDoor() {
        System.out.println("安装b玻璃门");
    }

    @Override
    public void buildFloor() {
        System.out.println("地板用木地板");
    }

    @Override
    protected boolean isBuildWardrobe() {
        return isBuildWardrobe;
    }
}
