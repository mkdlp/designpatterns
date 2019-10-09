package com.mkdlp.designpatterns.date20191009.state.work;

public class EveningState implements State {

    @Override
    public void handle(Work w) {
        if(w.isFinished()){
            w.setState(new RestState());
            w.work();
        }else{
            if(w.getHour()<21){
                System.out.println("现在是"+w.getHour()+"点，加班，疲惫至极");
            }else{
                w.setState(new SleepingState());
                w.work();
            }
        }

    }
}
