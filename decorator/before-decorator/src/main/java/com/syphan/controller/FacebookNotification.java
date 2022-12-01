package com.syphan.controller;

public class FacebookNotification implements Notification {

    @Override
    public void sendNotification(String message, String user) {
        System.out.println("Facebook notification: " + message + " to " + user);
    }
}
