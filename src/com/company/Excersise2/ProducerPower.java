package com.company.Excersise2;

public class ProducerPower extends ComplaintPower {

    @Override
    protected double getAllowable() {
        return BASE*1000;
    }

    @Override
    protected String getRole() {
        return "Producer";
    }
}
