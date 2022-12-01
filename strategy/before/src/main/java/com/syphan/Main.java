package com.syphan;

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
        String exportMethod;
        StringBuilder data = new StringBuilder();

        ExportTxt exportTxt = new ExportTxt();
        ExportTerminal exportTerminal = new ExportTerminal();

        do {
            System.out.print("Please, write the data you want to export.\n");
            data.append(reader.readLine());
            System.out.print("Do you wish to continue? y/n: ");
            continueChoice = reader.readLine();
        } while (continueChoice.equalsIgnoreCase("y"));

        do {
            System.out.print("How do you want to export your data? \n" +
                    "1 - Terminal \n" +
                    "2 - Txt file \n"
            );
            exportMethod = reader.readLine();

            if (exportMethod.equals("1")) {
                exportTerminal.writeData(data.toString());
                exportTerminal.export();
            } else if (exportMethod.equals("2")) {
                exportTxt.writeData(data.toString());
                exportTxt.export();
            } else {
                logger.warning("Invalid answer.");
                return;
            }
        } while(!(exportMethod.equals("1") || exportMethod.equals("2")));
    }
}
