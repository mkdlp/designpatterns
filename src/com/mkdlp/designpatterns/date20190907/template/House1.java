package com.mkdlp.designpatterns.date20190907.template;

public class House1 extends HouseTemplate {


    public House1() {
    }

    @Override
    public void buildWardrobe() {
        System.out.println("安装木衣柜");
    }

    @Override
    public void buildDoor() {
        System.out.println("安装防盗门");
    }

    @Override
    public void buildFloor() {
        System.out.println("地板用瓷砖");
    }


}
