package com.mkdlp.designpatterns.date20191011.Memento.blackcase;


public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public IMemento createMemento(){
        return new Memento(state);
    }

    public void setMemento(IMemento memento){
        this.setState(((Memento)memento).getState());
    }

    public void show(){
        System.out.println("State="+state);
    }

    private class Memento implements IMemento{
        private String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
