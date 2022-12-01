package com.syphan;

import com.syphan.model.ExportDataStrategy;
import com.syphan.model.ExportTerminal;
import com.syphan.model.ExportTxt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Logger logger = Logger.getLogger("Main");

    public static void main(String[] args) throws IOException {
        String continueChoice;
        ExportDataStrategy exportDataStrategy;

        System.out.print("How do you want to export your data? \n" +
                "1 - Terminal \n" +
                "2 - Txt file \n"
            );
        String exportMethod = reader.readLine();

        if(exportMethod.equals("1")) {
            exportDataStrategy = new ExportTerminal();
        } else if(exportMethod.equals("2")) {
            exportDataStrategy = new ExportTxt();
        } else {
            logger.warning("Invalid answer.");
            return;
        }

        do {
            System.out.print("Please, write the data you want to export.\n");
            exportDataStrategy.writeData(reader.readLine());
            System.out.print("Do you wish to continue? y/n: ");
            continueChoice = reader.readLine();
        } while (continueChoice.equalsIgnoreCase("y"));

        exportDataStrategy.export();
    }
}