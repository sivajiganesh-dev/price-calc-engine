package com.pricing.app.display;

public interface DisplayMessage {
    void display();

    void takeInput();

    void switchTo(DisplayMessage displayMessage);

}
