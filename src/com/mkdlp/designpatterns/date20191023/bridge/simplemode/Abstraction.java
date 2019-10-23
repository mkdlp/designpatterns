package com.mkdlp.designpatterns.date20191023.bridge.simplemode;

public class Abstraction {

    protected Implmentor implmentor;

    public void setImplmentor(Implmentor implmentor){
        this.implmentor=implmentor;
    }

    public  void operation(){
        implmentor.operation();
    }
}
