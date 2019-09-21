package com.mkdlp.designpatterns.date20190917.abstractfactory1;

public class AccessDepartment implements IDepartment {

    @Override
    public void insert() {
        System.out.println("access 插入 Department");
    }

    @Override
    public void get() {
        System.out.println("access 查询 Department");
    }

}
