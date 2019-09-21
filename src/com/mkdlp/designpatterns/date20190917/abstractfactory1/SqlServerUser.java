package com.mkdlp.designpatterns.date20190917.abstractfactory1;

public class SqlServerUser implements IUser {

    @Override
    public void insert() {
        System.out.println("SqlServer 插入user");
    }

    @Override
    public void get() {
        System.out.println("SqlServer 查询user");
    }
}
