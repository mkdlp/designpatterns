package com.mkdlp.designpatterns.date20191011.Memento.history;

public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        //修改状态
        o.changeState("state 0");
        //创建备忘录
        IMemento memento = o.createMemento();
        //修改状态
        o.changeState("state 1");
        //按照备忘录恢复对象的状态
        o.restoreMemento(memento);
        o.showState();
    }
}
