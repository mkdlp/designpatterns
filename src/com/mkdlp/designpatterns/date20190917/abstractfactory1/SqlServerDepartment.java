package com.mkdlp.designpatterns.date20190917.abstractfactory1;

public class SqlServerDepartment implements IDepartment {

    @Override
    public void insert() {
        System.out.println("SqlServer 插入 Department");
    }

    @Override
    public void get() {
        System.out.println("SqlServer 查询 Department");
    }

}
