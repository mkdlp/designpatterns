package com.mkdlp.designpatterns.date20191011.Memento.whitecase;

public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        this.setState(memento.getState());
    }

    public void show(){
        System.out.println("State="+state);
    }
}
