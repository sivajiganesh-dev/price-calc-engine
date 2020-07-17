package  com.pricing.app;

import com.pricing.app.data.ConfigureData;
import com.pricing.app.engine.PriceCalcEngine;
import com.pricing.app.enums.COMMANDS;

import java.util.Arrays;
import java.util.Scanner;

public class PricingApplication {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        String command;

        ConfigureData.initData();

        System.out.println(ConfigureData.components.size());


        PriceCalcEngine engine = new PriceCalcEngine(ConfigureData.components);
        engine.calculatePrice();
        while (engine.isExecutionCompleted()){
            System.out.println("Main Waiting...");
            Thread.sleep(200);
        }

        System.out.println("Total cost: "+PriceCalcEngine.totalCost.getCost());
    }

}
