package com.mkdlp.designpatterns.date20190907.prototype.simpleclone;

/**
 * 最简单的原型模式,说明这个类可以clone
 * Cloneable接口标识该对象是可以拷贝的
 *
 * 对象拷贝时，类的构造函数是不会被执行的。
 * 一个实现了 Cloneable 并重写了 clone 方法的类 A,有一个无参构造或有参构造 B，
 * 通过 new 关键字产生了一个对象 S，再然后通过 S.clone()方式产生了一个新的对象 T，
 * 那么在对象拷贝时构造函数 B 是不会被执行的， 对象拷贝时确实构造函数没有被执行，
 * 这个从原理来讲也是可以讲得通的，
 * Object 类的 clone 方法的 原理是从内存中（具体的说就是堆内存）以二进制流的方式进行拷贝，
 * 重新分配一个内存块，那构造函数 没有被执行也是非常正常的了。
 */
public class Person implements Cloneable {

    public Person() {
        System.out.println("执行构造方法");
    }

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
