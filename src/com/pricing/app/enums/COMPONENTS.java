package com.pricing.app.enums;

import com.pricing.app.cycle.components.Wheels;

import java.util.Arrays;

public enum  COMPONENTS {
    CHAIN(1,"Add Chain Component"),
    FRAME(2,"Add Frame Component"),
    HANDLE(3,"Add Handle Component"),
    SEAT(4,"Add Seat Component"),
    WHEELS(5,"Add Wheels Component");

    private int command;
    private String message;

    COMPONENTS(int command, String message) {
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

    @Override
    public String toString() {
        return Arrays.toString(COMPONENTS.values());
    }
}
