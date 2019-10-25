package com.mkdlp.designpatterns.date20191024.command.audioplayer;

import java.util.ArrayList;
import java.util.List;

public class MacroAudioCommand implements MacroCommand {

    private List<Command> commandList=new ArrayList<>();

    @Override
    public void add(Command command) {
        commandList.add(command);
    }

    @Override
    public void remove(Command command) {
        commandList.remove(command);
    }

    @Override
    public void excute(){
        for(Command command:commandList){
            command.excute();
        }
    }
}
