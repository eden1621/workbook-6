package com.pluralsight;

public class Jewelry implements Valuable {
    private String type;
    private double value;

    public Jewelry(String type, double value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}