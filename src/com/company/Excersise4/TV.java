package com.company.Excersise4;

public class TV extends Device {
    TV(String deviceName) {
        super(deviceName);
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public boolean enable() {
        return this.isEnabled()==true;
    }

    @Override
    public boolean disable() {
        return this.isEnabled()==false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public int setVolume(int percent) {
        if (getVolume() + percent <= 100 && getVolume() + percent >= 0) {
            return volume = getVolume() + percent;
        } else if (getVolume() + percent <= 0) {
            return volume = 0;
        } else {
            return volume = 100;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public int setChannel(int channel) {
        if (getChannel()+channel >=0 && getChannel()+channel <=999) {
            return this.channel = getChannel() + channel;
        }
        else if (getChannel()+channel<0) {
            return this.channel = 999;
        }
        else
            return this.channel = 0;
    }
}
