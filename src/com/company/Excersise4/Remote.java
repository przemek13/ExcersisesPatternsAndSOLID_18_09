package com.company.Excersise4;

public abstract class Remote {
   protected Device device;

   Remote (Device device) {
        this.device = device;
    }

   protected abstract void togglePower();
   protected abstract void volumeDown(int percent);
   protected abstract void volumeUp(int percent);
   protected abstract void channelDown();
   protected abstract void channelUp();
}
