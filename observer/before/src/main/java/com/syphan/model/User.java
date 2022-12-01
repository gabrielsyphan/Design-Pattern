package com.syphan.model;

import com.syphan.controller.EmailListener;
import com.syphan.controller.LogListener;

import java.util.logging.Logger;

public class User {

    private final Logger logger = Logger.getLogger(User.class.getName());
    private final EmailListener emailListener = new EmailListener();
    private final LogListener logListener = new LogListener();

    public void sendEmail() {
        this.logger.info("User just sent an email.");
        this.emailListener.onEvent("Email sent");
        this.logListener.onEvent("Email sent");
    }

    public void receiveEmail() {
        this.logger.info("User just receive an email.");
        this.emailListener.onEvent("Email received");
        this.logListener.onEvent("Email received");
    }
}
