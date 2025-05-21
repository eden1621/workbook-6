package com.pluralsight.PortfolioProject;

public class Asset {
    private String name; // asset has a name
    private double value;  //how much worth it  

    public Asset(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + ": $" + value;
    }
}
