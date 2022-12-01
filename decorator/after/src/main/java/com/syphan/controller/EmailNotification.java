package com.syphan.controller;

public class EmailNotification implements Notification{

    private final Notification notification;

    public EmailNotification() {
        this.notification = null;
    }

    public EmailNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void sendNotification(String message, String user) {
        System.out.println("Email notification: " + message + " to " + user);

        if (notification != null) {
            notification.sendNotification(message, user);
        }
    }
}
