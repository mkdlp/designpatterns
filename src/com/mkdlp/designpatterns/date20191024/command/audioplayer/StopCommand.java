package com.mkdlp.designpatterns.date20191024.command.audioplayer;

public class StopCommand implements Command {

    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void excute() {
        audioPlayer.stop();
    }
}
