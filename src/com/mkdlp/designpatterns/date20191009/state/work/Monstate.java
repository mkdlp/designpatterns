package com.mkdlp.designpatterns.date20191009.state.work;

public class Monstate implements State{

    @Override
    public void handle(Work w) {
        if(w.getHour()<12){
            System.out.println("现在是"+w.getHour()+"点！工作状态很好");
        }else{
            w.setState(new NoonState());
            w.work();
        }
    }
}
