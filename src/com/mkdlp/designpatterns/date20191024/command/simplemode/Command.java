package com.mkdlp.designpatterns.date20191024.command.simplemode;

public abstract class Command {

    protected Reciever reciever;

    public Command() {
    }

    public Command(Reciever reciever){
        this.reciever=reciever;
    }

    abstract public void excute();
}
