package alamsyah.praktikumPBO.pertemuan7.unguided;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UnguidedParseException {
    public static void main(String[] args) {
        String dataString = "2021 06 19";
        // instance of DateFormat
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // object date
        Date date;
        try {
            // to parse String to dateFormat
            date = dateFormat.parse(dataString);
            System.out.println(date);
        } catch (ParseException e) {
            // will be executed if the String value can't be changed to dateFormat
            System.out.println("Exception: " + e);
        }
    }
}
