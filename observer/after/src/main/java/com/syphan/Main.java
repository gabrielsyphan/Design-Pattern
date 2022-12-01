package com.syphan;

import com.syphan.controller.EmailListener;
import com.syphan.controller.LogListener;
import com.syphan.model.User;

public class Main {

    public static void main(String[] args) {

        // Instantiate the user
        User user = new User();

        // Instantiate the listeners
        user.eventManager.subscribe("sendEmail", new EmailListener());
        user.eventManager.subscribe("sendEmail", new LogListener());

        user.eventManager.subscribe("receiveEmail", new EmailListener());
        user.eventManager.subscribe("receiveEmail", new LogListener());

        // Send and receive and email, notifying the listeners
        user.sendEmail();
        user.receiveEmail();
    }
}