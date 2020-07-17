package com.pricing.app.enums;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.Arrays;

public enum COMMANDS {
    CREATE(1,"Create Cycle"),
    INCREASE_PRICE(2,"Increment Price by %"),
    DISCOUNT_PRICE(3,"Discount Price by %"),
    CALCULATE(4,"Calculate Total"),
    DISPLAY_ALL(5,"Display Data"),
    EXIT(6,"Exit!");

    int command;
    String message;

    COMMANDS(int command, String message) {
        this.command = command;
        this.message = message;
    }

    public int getCommand() {
        return command;
    }

    public void setCommand(int command) {
        this.command = command;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return Arrays.toString(COMMANDS.values());
    }
}
