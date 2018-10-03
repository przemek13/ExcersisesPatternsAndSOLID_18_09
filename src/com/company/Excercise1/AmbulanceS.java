package com.company.Excercise1;

public class AmbulanceS extends Ambulance {
    public AmbulanceS(Dispatcher dispatcher, int ambulanceID) {
        super(dispatcher, ambulanceID);
        ambulanceStatus = AmbulanceStatus.FREE;
    }

    public AmbulanceS(Dispatcher dispatcher, int ambulanceID, AmbulanceStatus ambulanceStatus) {
        super(dispatcher, ambulanceID);
        this.ambulanceStatus = ambulanceStatus;
    }

    @Override
    public void startAction(String notificationAddress) {
        ambulanceStatus = AmbulanceStatus.BUSY;
        System.out.println();
    }

    @Override
    public void finishAction() {
        ambulanceStatus = AmbulanceStatus.FREE;
        dispatcher.updateAmbulanceStatus(this);
    }
}
