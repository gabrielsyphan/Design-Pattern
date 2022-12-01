package com.syphan.controller;

public class WhatsappNotification implements Notification {

    @Override
    public void sendNotification(String message, String user) {
        System.out.println("Whatsapp notification: " + message + " to " + user);
    }
}
