package com.mkdlp.designpatterns.date20191011.Memento.manycheckpoints;

import java.util.List;

public class Memento {

    private List<String> states;

    private Integer index;

    public Memento(List<String> states, Integer index) {
        this.states = states;
        this.index = index;
    }

    public List<String> getStates() {
        return states;
    }

    public Integer getIndex() {
        return index;
    }
}
