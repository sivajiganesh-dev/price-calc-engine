package com.pricing.app.engine.worker;

import com.pricing.app.component.Component;
import com.pricing.app.cost.TotalCost;

import java.util.ArrayList;
import java.util.List;

public class CostCalculator implements Runnable{
    List<Component> parts = new ArrayList<>();
    TotalCost totalCost;
    private double cost = 0;

    public CostCalculator(List<Component> parts,TotalCost totalCost) {
        this.parts = parts;
        this.totalCost = totalCost;
    }

    @Override
    public void run() {
        System.out.println("Calculation Started");
        for(Component mainComponent : parts){

            for(Component subComponent : mainComponent.getSubComponents()){
                cost += subComponent.getOfferPrice() * subComponent.getQty();
            }

            cost+= mainComponent.getOfferPrice();
        }

        System.out.println("Calculation Ended and cost: "+cost);
        totalCost.increment(cost);
    }
}
