package com.mkdlp.designpatterns.date20191009.state.work;

public class Work {

    private State state;

    private int hour;

    private boolean finished;

    public Work() {
        this.finished=false;
        this.setState(new Monstate());
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getHour() {
        return hour;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void work(){
        this.state.handle(this);
    }
}
