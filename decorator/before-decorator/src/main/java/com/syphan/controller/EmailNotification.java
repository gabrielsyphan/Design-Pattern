package com.syphan.controller;

public class EmailNotification implements Notification {

    @Override
    public void sendNotification(String message, String user) {
        System.out.println("Email notification: " + message + " to " + user);
    }
}
