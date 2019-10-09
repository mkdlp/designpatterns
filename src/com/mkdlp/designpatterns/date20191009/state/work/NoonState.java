package com.mkdlp.designpatterns.date20191009.state.work;

public class NoonState implements State{

    @Override
    public void handle(Work w) {
        if(w.getHour()<13){
            System.out.println("现在是"+w.getHour()+"点！饿了困了，想午休");
        }else{
            w.setState(new AfternoonState());
            w.work();
        }
    }
}
