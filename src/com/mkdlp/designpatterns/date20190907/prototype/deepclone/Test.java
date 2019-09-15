package com.mkdlp.designpatterns.date20190907.prototype.deepclone;


import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        Person p1=new Person();
        p1.setList(list);
        Person p2=p1.clone();

        List list1=p1.getList();
        List list2=p2.getList();
        System.out.println("list1=list2?:"+(list1==list2));
    }




}
