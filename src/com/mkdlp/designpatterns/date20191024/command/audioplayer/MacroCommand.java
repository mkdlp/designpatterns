package com.mkdlp.designpatterns.date20191024.command.audioplayer;

public interface MacroCommand extends Command{

    void add(Command command);

    void remove(Command command);
}
