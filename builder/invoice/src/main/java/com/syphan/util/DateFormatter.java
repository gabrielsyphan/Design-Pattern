package com.syphan.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    public static Date stringToDate(String date) throws ParseException {
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("dd/MM/yyyy");
        return simpleFormatter.parse(date);
    }
}
