package com.mkdlp.designpatterns.date20191024.command.audioplayer;

public class RewindCommand implements Command {

    private AudioPlayer audioPlayer;

    public RewindCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void excute() {
        audioPlayer.rewind();
    }
}
