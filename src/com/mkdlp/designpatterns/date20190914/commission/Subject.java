package com.mkdlp.designpatterns.date20190914.commission;


public interface Subject {

    /**
    * @description 添加被委托的对象
    * @param
    * @author  mkdlp
    * @date  2019/9/14 17:52
    * @return
    */
    void addObserver(Observer observer);

    /**
    * @description 移除所有对象
    * @param
    * @author  mkdlp
    * @date  2019/9/14 17:52
    * @return
    */
    void removeAll();

    /**
    * @description 委托事件
    * @param subject 委托对象
     * @param ob 被委托对象
     * @param o 传给被委托者的参数
    * @author  mkdlp
    * @date  2019/9/14 17:54
    * @return
    */
    void event(Subject subject,Observer ob,Object o);

    /**
    * @description 委托很多事件
    * @param s
     * @param o
    * @author  mkdlp
    * @date  2019/9/14 17:55
    * @return
    */
    void eventAll(Subject s,Object o);

    /**
    * @description 获取唯一标识name
    * @param
    * @author  mkdlp
    * @date  2019/9/14 17:56
    * @return
    */
    String getName();
}
