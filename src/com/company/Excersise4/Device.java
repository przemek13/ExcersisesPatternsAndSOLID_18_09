package com.company.Excersise4;

public abstract class Device {
   private String deviceName;
   int volume=33;
   int channel=0;

   Device (String deviceName) {
       this.deviceName = deviceName;
   }

    abstract boolean isEnabled ();
    abstract boolean enable ();
    abstract boolean disable ();
    abstract int getVolume ();
    abstract int setVolume (int percent);
    abstract int getChannel ();
    abstract int setChannel (int channel);

    public String getDeviceName() {
        return deviceName;
    }
}
