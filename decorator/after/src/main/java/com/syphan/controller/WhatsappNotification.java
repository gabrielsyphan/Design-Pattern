package com.syphan.controller;

public class WhatsappNotification implements Notification{

    private final Notification notification;

    public WhatsappNotification() {
        this.notification = null;
    }

    public WhatsappNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void sendNotification(String message, String user) {
        System.out.println("Whatsapp notification: " + message + " to " + user);

        if (notification != null) {
            notification.sendNotification(message, user);
        }
    }
}
