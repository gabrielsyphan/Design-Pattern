package com.syphan.controller;

public class SlackNotification implements Notification {

    @Override
    public void sendNotification(String message, String user) {
        System.out.println("Slack notification: " + message + " to " + user);
    }
}
