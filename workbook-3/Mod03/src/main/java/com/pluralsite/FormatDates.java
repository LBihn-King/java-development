package com.pluralsite;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {

    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime gmtDateTime = LocalDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter dateTimeFormatter;

        dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(currentDateTime.format(dateTimeFormatter));

        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(currentDateTime.format(dateTimeFormatter));

        dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        System.out.println(currentDateTime.format(dateTimeFormatter));

        dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        ZonedDateTime zonedDateTime = currentDateTime.atZone(ZoneId.of("GMT"));
        System.out.println(dateTimeFormatter.format(zonedDateTime));

        dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm 'on' dd-MMM-yyyy");
        System.out.println(currentDateTime.format(dateTimeFormatter));
    }
}
