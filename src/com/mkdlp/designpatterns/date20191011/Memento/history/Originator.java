package com.mkdlp.designpatterns.date20191011.Memento.history;

public class Originator {

    private String state;

    public void changeState(String state){
        this.state=state;
        System.out.println("将状态改变为:"+state);
    }

    public Memento createMemento(){
        return new Memento(this);
    }

    public void restoreMemento(IMemento memento){
        Memento m=(Memento) memento;
        this.state=m.getState();
    }

    public void showState(){
        System.out.println("当前状态为:"+this.state);
    }

    private class Memento implements IMemento {

        private String state;

        public Memento(Originator  o) {
            this.state = o.state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
