package com.company.Excersise2;

public class ComplaintProcessing {
    public static void main(String[] args) {
        Complaint complaint1 = new Complaint(354372728, "Dell", "Sound doesn't work",500);
        Complaint complaint2 = new Complaint(837293827, "Samsung", "The case is loose",100);
        Complaint complaint3 = new Complaint(354372728, "Apple", "Computer doesn't turn on",5000);
        StationaryShopPower stationaryShop = new StationaryShopPower();
        HeadquartersPower headquarters = new HeadquartersPower();
        ProducerPower producer = new ProducerPower();
        stationaryShop.setSuccessor(headquarters);
        headquarters.setSuccessor(producer);
        stationaryShop.processComplaint(complaint1);
        stationaryShop.processComplaint(complaint2);
        stationaryShop.processComplaint(complaint3);
    }
}
