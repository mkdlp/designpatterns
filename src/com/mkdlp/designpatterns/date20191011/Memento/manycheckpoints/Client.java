package com.mkdlp.designpatterns.date20191011.Memento.manycheckpoints;

public class Client {
    public static void main(String[] args) {

        Originator o = new Originator();
        Caretaker c = new Caretaker(o);
        //改变状态
        o.setStates("state 0");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setStates("state 1");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setStates("state 2");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setStates("state 3");
        //建立一个检查点
        c.createMemento();
        //打印出所有检查点
        o.print();
        System.out.println("-----------------恢复检查点-----------------");
        //恢复到第二个检查点
        c.restoreMemento(2);
        //打印出所有检查点
        o.print();
    }
}
