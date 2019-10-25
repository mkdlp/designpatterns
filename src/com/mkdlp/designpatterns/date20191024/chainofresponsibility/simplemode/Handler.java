package com.mkdlp.designpatterns.date20191024.chainofresponsibility.simplemode;

public abstract class Handler {

    /**
    * @description
    * @author  mkdlp
    * @date  2019/10/24 16:16
     * 持有后继责任的对象
    */
    protected Handler successor;

    /**
    * @description
    * @author  mkdlp
    * @date  2019/10/24 16:17
     * 示意处理请求的方法，这里是无参的，也可有参，根据实际需求判断
    */
    public abstract void handlerRequest();

    /**
    * @description
    * @author  mkdlp
    * @date  2019/10/24 16:18
     * 取值方法
    */
    public Handler getSuccessor(){
        return successor;
    }

    /**
    * @description
    * @author  mkdlp
    * @date  2019/10/24 16:20
     * 赋值方法
    */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
