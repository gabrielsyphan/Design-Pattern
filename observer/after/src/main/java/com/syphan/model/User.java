package com.syphan.model;

import com.syphan.controller.EventManager;

import java.util.logging.Logger;

public class User {

    private final Logger logger = Logger.getLogger(User.class.getName());

    public EventManager eventManager;

    public User() {
        this.eventManager = new EventManager("sendEmail", "receiveEmail");
    }

    public void sendEmail() {
        this.logger.info("User just sent an email.");
        this.eventManager.notify("sendEmail", "Sending email...");
    }

    public void receiveEmail() {
        this.logger.info("User just receive an email.");
        this.eventManager.notify("receiveEmail", "Receiving email from user");
    }
}
