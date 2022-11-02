package com.syphan.model.logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class LoggerTxt extends LoggerFabric{

    private LoggerTxt(String name, String resourceBundleName) {
        super(name, resourceBundleName);
    }

    @Override
    public void show(String message) throws IOException {
        try {
            PrintWriter writer = new PrintWriter("logger.txt", StandardCharsets.UTF_8);
            String updatedMessage = LocalDateTime.now() + " - " + message;
            writer.println(updatedMessage);
            writer.close();
        } catch (IOException e) {
            throw new IOException("Error to write file. "+ e.getMessage());
        }
    }

    public static LoggerTxt getLoggerTxt(String resourceBundleName) {
        return new LoggerTxt(resourceBundleName, null);
    }
}
