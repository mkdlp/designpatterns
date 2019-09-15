package com.mkdlp.designpatterns.date20190913.Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> obList=new ArrayList<>();

    @Override
    public void addObserver(Observer ob) {
        obList.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        obList.remove(ob);
    }

    @Override
    public void notifyObserver() {
        for(Observer ob:obList){
            ob.update();
        }
    }
}
