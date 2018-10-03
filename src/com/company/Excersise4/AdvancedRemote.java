package com.company.Excersise4;

public class AdvancedRemote extends Remote {

    AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        if (device.enabled == false) {
            device.enable();
            device.isEnabled();
        } else {
            device.disable();
            device.isEnabled();
        }
    }

    @Override
    protected void volumeDown(int percent) {
        System.out.println(device.getDeviceName() + " volume was turned down to: " + device.setVolume(-percent) + "%");
    }

    @Override
    protected void volumeUp(int percent) {
        System.out.println(device.getDeviceName() + " volume was turned up to: " + device.setVolume(percent) + "%");
    }

    @Override
    protected void channelDown() {
        device.setChannel(-1);
        System.out.println("Current channel is " + device.getChannel());
    }

    @Override
    protected void channelUp() {
        device.setChannel(1);
        System.out.println("Current channel is " + device.getChannel());
    }

    protected void mute() {
        System.out.println("Current volume is " + device.setVolume(-100) + "%");
    }
}
