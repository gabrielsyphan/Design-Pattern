package com.syphan.controller;

public class FacebookNotification implements Notification{

    private final Notification notification;

    public FacebookNotification() {
        this.notification = null;
    }

    public FacebookNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void sendNotification(String message, String user) {
        System.out.println("Facebook notification: " + message + " to " + user);

        if (notification != null) {
            notification.sendNotification(message, user);
        }
    }
}
