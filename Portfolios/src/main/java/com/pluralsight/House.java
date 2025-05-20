package com.pluralsight;

public class House implements Valuable {
    private String address;
    private double marketValue;

    public House(String address, double marketValue) {
        this.address = address;
        this.marketValue = marketValue;
    }

    @Override
    public double getValue() {
        return marketValue;
    }

    public String getAddress() {
        return address;
    }
}