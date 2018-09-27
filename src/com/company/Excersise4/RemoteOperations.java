package com.company.Excersise4;

public class RemoteOperations {
    public static void main(String[] args) {
        AdvancedRemote remote = new AdvancedRemote(new Radio("Radio"));
        remote.togglePower();
        remote.volumeDown(13);
        remote.volumeUp(20);
        remote.channelDown();
        remote.channelDown();
        remote.channelUp();
        remote.channelUp();
        remote.mute();

        System.out.println();
        remote = new AdvancedRemote(new TV("TV"));
        remote.togglePower();
        remote.volumeDown(100);
        remote.volumeUp(100);
        remote.channelDown();
        remote.channelUp();
        remote.mute();

    }
}
