package com.company.Excercise1;

import java.util.ArrayList;
import java.util.List;

public class AmbulanceDispatcher implements Dispatcher {
    private List<Ambulance> ambulances;

    public AmbulanceDispatcher(){
        this.ambulances = new ArrayList<>();
    }

    @Override
    public void takeEmergencyCall(String callersName, String notificationAddress, String symptoms, Priority priority)
    {
        if (priority==Priority.HIGH) {
        System.out.println("Emergency call from : " + callersName + " on the address: " + notificationAddress + ", with symptoms: " + symptoms + ", accepted.");
        sendAmbulance(notificationAddress);
        System.out.println();}
        else {
            System.out.println("Emergency call from : " + callersName + " on the address: " + notificationAddress + ", with symptoms: " + symptoms + ", refused. Priority: " + priority);
            System.out.println();
        }
    }

    @Override
    public void sendAmbulance(String notificationAddress) {
        for (Ambulance ambulance : ambulances) {
            if (ambulance.ambulanceStatus == AmbulanceStatus.FREE){
                System.out.print(ambulance.ambulanceStatus + " " + ambulance + " starts action on: " + notificationAddress + ".");
                ambulance.startAction(notificationAddress);
                return;
            }
        }
        System.out.println("No free ambulances. Caller informed ambulance will be sent ASAP.");
    }

    @Override
    public void updateAmbulanceStatus(Ambulance ambulance) {
        System.out.println("Update ambulance status: " + ambulance);
    }

    @Override
    public void addAmbulance(Ambulance ambulance) {
        ambulances.add(ambulance);
    }

}
