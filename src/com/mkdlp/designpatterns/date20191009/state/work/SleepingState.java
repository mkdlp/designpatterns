package com.mkdlp.designpatterns.date20191009.state.work;

public class SleepingState implements State{

    @Override
    public void handle(Work w) {
        System.out.println("现在是"+w.getHour()+"点，困得不行睡着了!");
    }
}
