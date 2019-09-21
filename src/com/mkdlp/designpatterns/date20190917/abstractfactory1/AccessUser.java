package com.mkdlp.designpatterns.date20190917.abstractfactory1;

public class AccessUser implements IUser {

    @Override
    public void insert() {
        System.out.println("access 插入user");
    }

    @Override
    public void get() {
        System.out.println("access 查询user");
    }
}
