package day21datetimestringbuilder;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        LocalTime currentTime=LocalTime.now();
        System.out.println("currentTime = " + currentTime);//currentTime = 11:22:28.511728100

        //How to format time
        //Using "a" at the end it tells you if it is AM or PM

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm");
        String myTime=dtf.format(currentTime);
        System.out.println("myTime = " + myTime); //myTime = 11:24
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm");
        String myTime1=dtf1.format(currentTime);
        System.out.println("myTime = " + myTime1);//myTime = 11:32

        //"hh" uses 12 hours system, "HH" uses 24 hours system
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("hh:mm a");
        String myTime2=dtf2.format(currentTime);
        System.out.println("myTime = " + myTime2);//myTime = 11:32 a.m.

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("Local datetime = " + ldt);

        LocalDateTime ldtTurkey=LocalDateTime.now(ZoneId.of("Asia/Istanbul"));
        System.out.println("ldtTurkey = " + ldtTurkey);


    }
}
