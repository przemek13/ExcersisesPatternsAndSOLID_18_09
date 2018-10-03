package com.company.Excersise4;

public abstract class Device {
    private final String deviceName;
    protected int volume;
    protected int channel;
    protected boolean enabled;

    public Device(String deviceName, int volume, int channel, boolean enabled) {
        this.deviceName = deviceName;
        this.volume = volume;
        this.channel = channel;
        this.enabled = enabled;
    }

    abstract void isEnabled();

    abstract boolean enable();

    abstract boolean disable();

    abstract int getVolume();

    abstract int setVolume(int percent);

    abstract int getChannel();

    abstract int setChannel(int channel);

    public String getDeviceName() {
        return deviceName;
    }

    public void enableCheck() {
        if (enabled == true) {
            System.out.println(getDeviceName() + " enabled");
        } else {
            System.out.println(getDeviceName() + " disabled");
        }
    }

    public int volumeCheck(int volumeMax, int volumeMin, int percent) {
        if (getVolume() + percent <= volumeMax && getVolume() + percent >= volumeMin) {
            return volume = getVolume() + percent;
        } else if (getVolume() + percent <= volumeMin) {
            return volumeMin;
        } else {
            return volumeMax;
        }
    }

    public int channelCheck(int channelMax, int channelMin, int channel) {
        if (getChannel() + channel >= channelMin && getChannel() + channel <= channelMax) {
            return this.channel = getChannel() + channel;
        } else if (getChannel() + channel < channelMin) {
            return this.channel = channelMax;
        } else
            return this.channel = channelMin;
    }
}
