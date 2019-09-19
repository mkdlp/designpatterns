package com.mkdlp.designpatterns.date20190914.commission;

/**
 * 测试类，整个程序的入口
 * @author 张三
 *
 */
public class DelegationDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Delegation d = new Delegation("张三");
        A a = new A("李四");
        d.addObserver(a);
        d.event(d, a, "买早餐");
        A b = new A("王五");
        d.addObserver(b);
        d.eventAll(d, "要美女的联系方式");
    }
}