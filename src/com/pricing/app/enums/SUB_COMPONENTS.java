package com.pricing.app.enums;

import java.util.Arrays;

public enum  SUB_COMPONENTS {
    RIM(1,"Add Rim"),
    SEAT_COVER(1,"Add Chain Component"),
    SPOKES(1,"Add Chain Component"),
    STAND(1,"Add Chain Component"),
    TUBE(1,"Add Chain Component"),
    TYPE(1,"Add Chain Component");

    private int command;
    private String message;

    SUB_COMPONENTS(int command, String message) {
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
        return Arrays.toString(SUB_COMPONENTS.values());
    }
}
