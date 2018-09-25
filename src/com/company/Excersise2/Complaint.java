package com.company.Excersise2;

public class Complaint {
    private int merchandiseID;
    private String merchandiseName;
    private double expectedCost;
    private String complaintReason;

    public Complaint(int merchandiseID, String merchandiseName, String complaintReason, double expectedCost) {
        this.merchandiseID = merchandiseID;
        this.merchandiseName = merchandiseName;
        this.expectedCost = expectedCost;
        this.complaintReason = complaintReason;
    }

    public int getMerchandiseID() {
        return merchandiseID;
    }

    public void setMerchandiseID(int merchandiseID) {
        this.merchandiseID = merchandiseID;
    }

    public String getMerchandiseName() {
        return merchandiseName;
    }

    public void setMerchandiseName(String merchandiseName) {
        this.merchandiseName = merchandiseName;
    }

    public double getExpectedCost() {
        return expectedCost;
    }

    public void setExpectedCost(double expectedCost) {
        this.expectedCost = expectedCost;
    }

    public String getComplaintReason() {
        return complaintReason;
    }

    public void setComplaintReason(String complaintReason) {
        this.complaintReason = complaintReason;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "merchandiseID=" + merchandiseID +
                ", merchandiseName='" + merchandiseName + '\'' +
                ", expectedCost=" + expectedCost +
                ", complaintReason='" + complaintReason + '\'' +
                '}';
    }
}
