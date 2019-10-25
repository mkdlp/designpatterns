package com.mkdlp.designpatterns.date20191024.command.simplemode;

public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void excuteCommand(){
        command.excute();
    }
}
