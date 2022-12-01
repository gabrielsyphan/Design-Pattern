package com.syphan.controller;

public class SlackNotification implements Notification{

    private final Notification notification;

    public SlackNotification() {
        this.notification = null;
    }

    public SlackNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void sendNotification(String message, String user) {
        System.out.println("Slack notification: " + message + " to " + user);

        if (notification != null) {
            notification.sendNotification(message, user);
        }
    }
}
