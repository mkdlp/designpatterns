package com.mkdlp.designpatterns.date20190907.prototype.shallowclone;

import java.util.List;

/**
 * 浅度克隆
 * 这就是浅度克隆，当被克隆的类中有引用对象（String或Integer等包装类型除外）时，
 * 克隆出来的类中的引用变量存储的还是之前的内存地址，也就是说克隆与被克隆的对象是同一个。
 * 这样的话两个对象共享了一个私有变量，所有人都可以改，是一个种非常不安全的方式，在实际项目中使用还是比较少的。
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
            return (Person)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
