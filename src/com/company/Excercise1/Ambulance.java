package com.company.Excercise1;

public abstract class Ambulance {
    protected AmbulanceStatus ambulanceStatus;
    protected final Dispatcher dispatcher;
    protected final int id;

    public Ambulance(Dispatcher dispatcher, int id) {
        this.dispatcher = dispatcher;
        this.id = id;
    }

    public abstract void startAction(String notificationAddress);

    public abstract void finishAction();

    @Override
    public String toString() {
        return "Ambulance{" +
                "id=" + id +
                '}';
    }
}
