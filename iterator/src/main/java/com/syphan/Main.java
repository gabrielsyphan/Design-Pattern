package com.syphan;

import com.syphan.service.iterator.SimCardIterator;
import com.syphan.service.iterator.VivoCardIterador;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        SimCardIterator simCardIterator = new VivoCardIterador("Gabriel Syphan");
        while(simCardIterator.hasNext()) {
            logger.info(simCardIterator.next().toString());
        }
    }
}