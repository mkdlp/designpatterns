package com.mkdlp.designpatterns.date20191024.command.simplemode;

public class Test {
    public static void main(String[] args) {
        Reciever reciever=new Reciever();

        Command c=new ConcreteCommand(reciever);

        Invoker i=new Invoker(c);

        i.excuteCommand();

    }
}
