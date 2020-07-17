package com.pricing.app.cost;

public class TotalCost {
    private double cost = 0;

    public TotalCost(double cost) {
        this.cost = cost;
    }

    public synchronized void increment(double partCost){
        cost += partCost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
