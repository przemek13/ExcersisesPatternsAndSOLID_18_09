package com.company.Excersise4;

public class RemoteOperations {
    public static void main(String[] args) {
        Radio radio = new Radio("Radio");
        AdvancedRemote remote = new AdvancedRemote(radio);
        remote.togglePower();
        remote.volumeDown(13);
        remote.volumeDown(13);
        remote.volumeUp(20);
        remote.volumeUp(20);
        remote.channelDown();
        remote.channelDown();
        remote.channelUp();
        remote.channelUp();
        remote.mute();
    }
}
