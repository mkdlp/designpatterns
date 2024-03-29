package com.mkdlp.designpatterns.date20191024.chainofresponsibility.simplemode;

public class ConcreteHandler extends Handler {

    @Override
    public void handlerRequest() {
        if(getSuccessor()!=null){
            System.out.println("放过请求！");
            getSuccessor().handlerRequest();
        }else{
            System.out.println("处理请求！");
        }
    }
}
