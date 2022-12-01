package com.syphan;

import com.syphan.model.User;

public class Main {

    public static void main(String[] args) {

        // Instantiate the user
        User user = new User();

        // Send and receive and email, notifying the listeners
        user.sendEmail();
        user.receiveEmail();
    }
}