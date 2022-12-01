package com.syphan.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class ExportTxt {

    Logger logger = Logger.getLogger("ExportTxt");

    private StringBuilder data = new StringBuilder("");

    public ExportTxt() { }

    public ExportTxt(String data) {
        this.data.append(data);
    }

    public void writeData(String data) {
        this.data.append(data);
    }

    public String getData() {
        return this.data.toString();
    }

    public boolean export() throws IOException {
        boolean success = false;
        try {
            File file = new File("data.txt");

            if (file.createNewFile()) {
                this.logger.info("File created: " + file.getName());
            }

            FileWriter fileWriter = new FileWriter(file.getAbsolutePath());
            fileWriter.write(this.data.toString());
            fileWriter.close();

            success = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return success;
    }
}
