package com.pluralsight;

public class Gold implements Valuable {
    private double weightInGrams;
    private double pricePerGram;

    public Gold(double weightInGrams, double pricePerGram) {
        this.weightInGrams = weightInGrams;
        this.pricePerGram = pricePerGram;
    }

    @Override
    public double getValue() {
        return weightInGrams * pricePerGram;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public double getPricePerGram() {
        return pricePerGram;
    }
}