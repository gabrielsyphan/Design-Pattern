package com.syphan.model;

import java.io.IOException;
import java.util.logging.Logger;

public class ExportTerminal implements ExportDataStrategy {

    Logger logger = Logger.getLogger("ExportTerminal");

    private StringBuilder data = new StringBuilder("");

    public ExportTerminal() { }

    public ExportTerminal(String data) {
        this.data.append(data);
    }

    @Override
    public void writeData(String data) {
        this.data.append(data);
    }

    @Override
    public String getData() {
        return this.data.toString();
    }

    @Override
    public boolean export() throws IOException {
        this.logger.info(this.data.toString());
        return true;
    }
}
