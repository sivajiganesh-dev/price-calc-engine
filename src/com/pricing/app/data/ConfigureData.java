package com.pricing.app.data;

import com.pricing.app.component.Component;
import com.pricing.app.cycle.components.*;
import com.pricing.app.cycle.components.subcomponents.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ConfigureData {
    public static List<Component> components = new ArrayList<>();

    public static void initData(){
        Chain chain = new Chain("Chani",15.0);
        Spokes spokes =new Spokes("Spokes",5);
        chain.addSubComponent(spokes);

        Frame frame = new Frame("Frame",50.0);

        HandleWithBreaks handleWithBreaks = new HandleWithBreaks("Handle",20.0);

        Seats seats = new Seats("Seats",10.0);
        SeatCover cover =new SeatCover("Cover",5.0);
        seats.addSubComponent(cover);


        Wheels wheels = new Wheels("Wheels",60.0);
        Tube tube = new Tube("Tube",10);
        Rim rim = new Rim("Rim",7);
        Tyre type = new Tyre("Tyre",10);

        wheels.addSubComponent(tube);
        wheels.addSubComponent(rim);
        wheels.addSubComponent(type);

        components.add(chain);
        components.add(wheels);
        components.add(seats);
        components.add(frame);
    }
}
