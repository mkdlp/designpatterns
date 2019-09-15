package com.mkdlp.designpatterns.date20190913.Observer;

public interface Subject {

    void addObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObserver();
}
