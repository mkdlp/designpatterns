package com.mkdlp.designpatterns.date20191009.state;

public class StateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("hadleB");
        context.setState(new StateA());
    }
}
