package com.mkdlp.designpatterns.date20191024.command.simplemode;

public class ConcreteCommand extends Command {

    public ConcreteCommand(Reciever reciever){
        this.reciever=reciever;
    }

    @Override
    public void excute() {
        reciever.action();
    }
}
