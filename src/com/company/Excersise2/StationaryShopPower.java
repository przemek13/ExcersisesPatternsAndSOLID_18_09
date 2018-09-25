package com.company.Excersise2;

public class StationaryShopPower extends ComplaintPower {
    @Override
    protected double getAllowable() {
        return BASE;
    }

    @Override
    protected String getRole() {
        return "Stationery shop";
    }
}
