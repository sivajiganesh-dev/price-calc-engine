package com.pricing.app.engine;

import com.pricing.app.engine.worker.CostCalculator;
import com.pricing.app.component.Component;
import com.pricing.app.cost.TotalCost;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class PriceCalcEngine {

    List<Component> parts = new ArrayList<>();
    public  static TotalCost totalCost = new TotalCost(0);

    public PriceCalcEngine(List<Component> parts) {
        this.parts = parts;
    }

    ThreadPoolExecutor executor = new ThreadPoolExecutor(
            4,
            10,
            0l,
            TimeUnit.MILLISECONDS,
            new LinkedBlockingDeque<>()
    );

    public void calculatePrice() throws InterruptedException {
        for(int i = 0; i < 1000; i++){
            executor.execute(new CostCalculator(parts,totalCost));
        }

        while (executor.getActiveCount() > 0){
            System.out.println("Engine Waiting...");
            Thread.sleep(100);
        }

        executor.shutdown();
        if(!executor.isTerminated())
            executor.awaitTermination(100,TimeUnit.MILLISECONDS);
    }

    public boolean isExecutionCompleted(){
       return executor.getActiveCount() > 0;
    }
}
