package com.syphan.model.logger;

import java.io.IOException;
import java.util.logging.Logger;

public abstract class LoggerFabric extends Logger {

    public abstract void show(String message) throws IOException;

    public LoggerFabric(String name, String resourceBundleName) {
        super(name, resourceBundleName);
    }
}
