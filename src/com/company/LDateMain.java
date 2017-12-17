package com.company;


import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LDateMain {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2004, 2, 29);
        LocalDateTime ect = LocalDateTime.now(ZoneId.of("Europe/Budapest"));
        LocalDateTime utc = LocalDateTime.now(Clock.systemUTC());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY. LLLL dd.");
        String formattedDate = localDate.format(dateTimeFormatter);
        System.out.println(formattedDate);
        System.out.println(ect);
        System.out.println(utc);
    }
}
