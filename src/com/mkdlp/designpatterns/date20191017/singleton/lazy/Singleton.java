package com.mkdlp.designpatterns.date20191017.singleton.lazy;

/**

* @author  mkdlp
* @date  2019/10/17 17:42
* @description
 * 饱汉模式(懒汉模式)
 * 优点：懒加载启动快，资源占用小，使用时才实例化，无锁。
 *
 * 缺点：非线程安全。
*/
public class Singleton {

    private static Singleton singleton=null;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(singleton==null){
            return new Singleton();
        }
        return singleton;
    }
}
