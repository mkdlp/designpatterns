package com.mkdlp.designpatterns.date20191024.command.audioplayer;

public class AudioPlayer {

    public void play(){
        System.out.println("播放");
    }

    public void rewind(){
        System.out.println("倒带");
    }

    public void stop(){
        System.out.println("停止");
    }
}
