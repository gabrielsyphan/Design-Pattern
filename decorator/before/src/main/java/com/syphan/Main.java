package com.syphan;

import com.syphan.controller.EmailNotification;
import com.syphan.controller.FacebookNotification;
import com.syphan.controller.Notification;
import com.syphan.controller.WhatsappNotification;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Notification> notifications = List.of(
                new WhatsappNotification(),
                new EmailNotification(),
                new FacebookNotification()
            );

        notifications.forEach(notification -> notification.sendNotification("Hello", "Syphan"));
    }
}