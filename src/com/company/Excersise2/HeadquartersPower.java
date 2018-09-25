package com.company.Excersise2;

public class HeadquartersPower extends ComplaintPower {
    @Override
    protected double getAllowable() {
        return BASE*5;
    }

    @Override
    protected String getRole() {
        return "Headquarters";
    }
}
