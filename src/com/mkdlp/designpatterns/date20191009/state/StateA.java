package com.mkdlp.designpatterns.date20191009.state;

public class StateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("hadleA");
        context.setState(new StateB());
    }
}
