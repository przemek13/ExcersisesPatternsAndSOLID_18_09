package com.company.Excersise4;

public class RemoteOperations {
    public static void main(String[] args) {
        AdvancedRemote remote = new AdvancedRemote(new Radio("Radio", 33, 0, true));
        remote.togglePower();
        remote.togglePower();
        remote.volumeDown(10);
        remote.volumeUp(20);
        remote.channelDown();
        remote.channelUp();
        remote.mute();

        System.out.println();
        remote = new AdvancedRemote(new TV("TV", 33, 0, false));
        remote.togglePower();
        remote.volumeDown(100);
        remote.volumeUp(100);
        remote.channelDown();
        remote.channelUp();
        remote.mute();

        Client client = new Client(remote);
        client.remote.togglePower();

    }
}
