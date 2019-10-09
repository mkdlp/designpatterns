package com.mkdlp.designpatterns.date20191009.state.work;

public class AfternoonState implements State {

    @Override
    public void handle(Work w) {
        if(w.getHour()<17){
            System.out.println("现在是"+w.getHour()+"下午工作状态还不错，继续努力");
        }else{
            w.setState(new EveningState());
            w.work();
        }
    }
}
