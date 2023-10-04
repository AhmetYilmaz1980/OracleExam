package com.oracleExam.ORC41_DateTime;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime d =LocalDateTime.of(2015,5,10,9,22,33);
        Period p = Period.of(3,0,2);
        d=d.minus(p);
        System.out.println(d);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm");
        System.out.println(f.format(d));

       /** LocalDateTime a = LocalDateTime.of(1980,04,24,12,22);
        f.format(a);
        Period b=Period.of(43,4,11);
        a=a.plus(b);
        System.out.println(a);
        */

    }
}
