package com.syphan.model.logger;

import java.time.LocalDateTime;

public class LoggerTerminal extends LoggerFabric {

    private LoggerTerminal(String name, String resourceBundleName) {
        super(name, resourceBundleName);
    }

    @Override
    public void show(String message) {
        String updatedMessage = LocalDateTime.now() + " - " + message;
        System.out.println(updatedMessage);
    }

    public static LoggerTerminal getLoggerTerminal(String resourceBundleName) {
        return new LoggerTerminal(resourceBundleName, null);
    }
}
