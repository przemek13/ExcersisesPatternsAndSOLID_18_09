package com.company.Excersise2;

public abstract class ComplaintPower {
    protected static final double BASE = 100;
    protected ComplaintPower successor;

    abstract protected double getAllowable();

    abstract protected String getRole();

    public void setSuccessor(ComplaintPower successor) {
        this.successor = successor;
    }

    public void processComplaint(Complaint complaint) {
        if (complaint.getExpectedCost() <= this.getAllowable()) {
            System.out.println(complaint + " will be approved by " + this.getRole() + ".");
        } else if (successor != null) {
            successor.processComplaint(complaint);
        }
    }
}
