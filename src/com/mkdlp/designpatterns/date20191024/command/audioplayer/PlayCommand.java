package com.mkdlp.designpatterns.date20191024.command.audioplayer;

public class PlayCommand implements Command {

    private AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void excute() {
        audioPlayer.play();
    }
}
