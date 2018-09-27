package com.company.Excersise4;

public class AdvancedRemote extends Remote {

    AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
            System.out.println(device.getDeviceName() + " disabled");
        }
        else {
            device.enable();
            System.out.println(device.getDeviceName() + " enabled");
    }
}

    @Override
    protected void volumeDown(int percent) {
        device.setVolume(-percent);
        System.out.println(device.getDeviceName() + " volume was turned down to: " + device.getVolume() + "%");
    }

    @Override
    protected void volumeUp(int percent) {
        device.setVolume(percent);
        System.out.println(device.getDeviceName() + " volume was turned up to: " + device.getVolume() + "%");
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

    protected void  mute() {
        device.setVolume(-100);
        System.out.println("Current volume is " + device.getVolume());
    }
}
