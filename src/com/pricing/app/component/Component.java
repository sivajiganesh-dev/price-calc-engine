package com.pricing.app.component;

import java.util.ArrayList;
import java.util.List;

public class Component {
    private String name;
    private double price;
    private double offerPrice;
    List<Component> subComponents = new ArrayList<>();
    private int qty = 1;

    public Component(String name, double price) {
        this.name = name;
        this.price = price;
        this.offerPrice = this.price;
    }

    public void addSubComponent(Component component){
        for(Component comp : subComponents){
            if(component.getName().equals(comp.getName()))
                return;
        }

        this.subComponents.add(component);
    }

    public void updatePrice(double factory){
        this.offerPrice = (this.price * factory) + this.price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getOfferPrice() {
        return offerPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Component> getSubComponents() {
        return subComponents;
    }

    public void setSubComponents(List<Component> subComponents) {
        this.subComponents = subComponents;
    }
}
