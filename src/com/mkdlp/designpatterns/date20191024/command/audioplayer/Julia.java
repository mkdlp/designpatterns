package com.mkdlp.designpatterns.date20191024.command.audioplayer;

public class Julia {

    public static void main(String[] args) {

        //创建接收者对象
        AudioPlayer audioPlayer=new AudioPlayer();

        //创建命令对象
        Command playCommand=new PlayCommand(audioPlayer);

        Command rewindCommand=new RewindCommand(audioPlayer);

        Command stopCommand=new StopCommand(audioPlayer);

        //创建请求者对象
        KeyPad keyPad=new KeyPad();

        keyPad.setPlayCommand(playCommand);

        keyPad.setRewindCommand(rewindCommand);

        keyPad.setStopCommand(stopCommand);

        //测试
        keyPad.play();

        keyPad.rewind();

        keyPad.stop();

        MacroCommand marcoCommand=new MacroAudioCommand();
        marcoCommand.add(playCommand);
        marcoCommand.add(rewindCommand);
        marcoCommand.add(stopCommand);

        marcoCommand.excute();
    }
}
