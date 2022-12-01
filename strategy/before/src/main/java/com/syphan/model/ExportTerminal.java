package com.syphan.model;

import java.io.IOException;
import java.util.logging.Logger;

public class ExportTerminal {

    Logger logger = Logger.getLogger("ExportTerminal");

    private StringBuilder data = new StringBuilder("");

    public ExportTerminal() { }

    public ExportTerminal(String data) {
        this.data.append(data);
    }

    public void writeData(String data) {
        this.data.append(data);
    }

    public String getData() {
        return this.data.toString();
    }

    public boolean export() throws IOException {
        this.logger.info(this.data.toString());
        return true;
    }
}
