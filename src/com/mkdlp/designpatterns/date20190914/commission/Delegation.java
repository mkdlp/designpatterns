package com.mkdlp.designpatterns.date20190914.commission;

import java.util.ArrayList;
import java.util.List;

public class Delegation implements Subject{
    /**
     * 本类对象的唯一标识name
     * @param name
     */
    @SuppressWarnings("unused")
    private String name;
    /**
     * 存储被委托者对象的集合，位于java.util包中
     */
    List<Observer> l = new ArrayList<>();
    /**
     * 构造方法
     */
    Delegation(String name){
        this.name = name;
    }
    /**
     * 添加被委托对象的方法
     * @param obj:被委托对象
     */
    @Override
    public void addObserver(Observer obj) {
        // TODO Auto-generated method stub
        if (l==null) {
            throw new NullPointerException();
        }
        else {
            if (!l.contains(obj)) {
                l.add(obj);
            }
        }
    }
    /**
     * 委托的事件方法
     */
    @Override
    public void event(Subject s,Observer obj,Object o) {
        // TODO Auto-generated method stub
        obj.doEvent(s,o);
    }
    /**
     * 移除所有被委托对象
     */
    @Override
    public void removeAll() {
        // TODO Auto-generated method stub
        l.clear();
    }
    /**
     * 全部被委托者要做的事件方法
     */
    @Override
    public void eventAll(Subject s,Object obj) {
        // TODO Auto-generated method stub
        for(Observer o:l) {
            o.doEvent(s,obj);
        }
    }
    /**
     * 获取唯一标识name
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }
}