package com.syphan.model;

import java.io.IOException;

public interface ExportDataStrategy {

    public void writeData(String data);
    public String getData();
    public boolean export() throws IOException;
}
