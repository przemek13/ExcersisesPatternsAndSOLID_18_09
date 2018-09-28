package com.company.Excercise1;

public interface Dispatcher {
    void takeEmergencyCall(String callersName, String notificationAddress, String symptoms, Priority priority);

    void sendAmbulance(String notificationAddress);

    void updateAmbulanceStatus(Ambulance ambulance);

    void addAmbulance(Ambulance ambulance);
}
