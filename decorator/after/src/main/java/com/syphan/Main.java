package com.syphan;

import com.syphan.controller.EmailNotification;
import com.syphan.controller.FacebookNotification;
import com.syphan.controller.Notification;
import com.syphan.controller.WhatsappNotification;

public class Main {
    public static void main(String[] args) {

        Notification notification = new EmailNotification(new FacebookNotification(new WhatsappNotification()));
        notification.sendNotification("Hello", "Syphan");
    }
}