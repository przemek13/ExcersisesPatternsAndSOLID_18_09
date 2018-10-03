package com.company.Excersise4;

public class Radio extends Device {

    public Radio(String deviceName, int volume, int channel, boolean enabled) {
        super(deviceName, volume, channel, enabled);
    }

    @Override
    public void isEnabled() {
        enableCheck();
    }

    @Override
    public boolean enable() {
        return enabled = true;
    }

    @Override
    public boolean disable() {
        return enabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public int setVolume(int percent) {
        return volumeCheck(100, 0, percent);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public int setChannel(int channel) {
        return channelCheck(10, 0, channel);
    }
}
