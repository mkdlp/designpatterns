package com.mkdlp.designpatterns.date20191011.Memento.blackcase;

import com.mkdlp.designpatterns.date20191011.Memento.whitecase.Memento;

public class Caretaker {

    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
}
