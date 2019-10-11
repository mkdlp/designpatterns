package com.mkdlp.designpatterns.date20191011.Memento.manycheckpoints;

import java.util.ArrayList;
import java.util.List;

public class Originator {

    private List<String> states;

    private Integer index;

    public Originator() {
        this.states = new ArrayList<>();

        this.index=0;
    }

    public Memento createMemento(){
        List<String> newList=new ArrayList<>();
        newList.addAll(states);
        return new Memento(newList,index);
    }

    public void restoreMemento(Memento memento){
        this.states=memento.getStates();
        this.index=memento.getIndex();
    }

    public void setStates(String states){
        this.states.add(states);
        index++;
    }

    public void print(){
        for(String str:this.states){
            System.out.println(str);
        }
    }
}
