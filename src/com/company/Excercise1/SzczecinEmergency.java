package com.company.Excercise1;

public class SzczecinEmergency {
    public static void main(String[] args) {
        Dispatcher dispatcher = new AmbulanceDispatcher();

        Ambulance ambulance1 = new AmbulanceS(dispatcher, 1);
        Ambulance ambulance2 = new AmbulanceS(dispatcher, 2, AmbulanceStatus.BUSY);
        Ambulance ambulance3 = new AmbulanceS(dispatcher, 3);

        dispatcher.addAmbulance(ambulance1);
        dispatcher.addAmbulance(ambulance2);
        dispatcher.addAmbulance(ambulance3);

        dispatcher.takeEmergencyCall("Adam Nowak", "Mickiewicza 1a", "loss of consciousness", Priority.HIGH);
        dispatcher.takeEmergencyCall("Jan Kowalski", "Sienkiewicza 2b", "heart attack", Priority.HIGH);
        dispatcher.takeEmergencyCall("Maria Wolska", "Kochanowskiego 3c", "breath shortness", Priority.LOW);
        dispatcher.takeEmergencyCall("Anna Król", "Prusa 4d", "childbirth", Priority.HIGH);
    }
}
