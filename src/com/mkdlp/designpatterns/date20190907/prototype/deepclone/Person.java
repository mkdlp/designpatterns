package com.mkdlp.designpatterns.date20190907.prototype.deepclone;

import java.util.ArrayList;
import java.util.List;

/**
 * 这样就完成了深度拷贝，两种对象互为独立，属于单独对象。
 */
public class Person implements Cloneable {

    private String name;

    private String sex;

    private List<String> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    //可能会抛出不支持克隆异常，原因是没有实现Cloneable接口
    @Override
    protected Person clone() {
        try {
            Person person=(Person)super.clone();
            List<String> list=new ArrayList();
            List<String> p1List=person.getList();
            for(String s:p1List){
                list.add(s);
            }
            person.setList(list);
            return person;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
