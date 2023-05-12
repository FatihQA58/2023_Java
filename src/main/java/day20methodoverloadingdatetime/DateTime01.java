package day20methodoverloadingdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //HOW TO GET CURRENT DATE
       LocalDate currentDate=LocalDate.now();
        System.out.println("currentDate = " + currentDate);//2023-04-18

        //HOW TO GET COMPONENTS OF THE DATE
        System.out.println(currentDate.getYear());//2023
        System.out.println("currentDate.getDayOfYear() = " + currentDate.getDayOfYear());//108
        System.out.println("currentDate.isLeapYear() = " + currentDate.isLeapYear());//false
        System.out.println("currentDate.lengthOfYear() = " + currentDate.lengthOfYear());//365

        System.out.println("currentDate.getDayOfMonth() = " + currentDate.getDayOfMonth());// 18
        System.out.println("currentDate.getMonth() = " + currentDate.getMonth());//APRIL
        System.out.println("currentDate.getMonthValue() = " + currentDate.getMonthValue());//4
        System.out.println("currentDate = " + currentDate.lengthOfMonth());//30
        System.out.println("currentDate.withDayOfMonth(15) = " + currentDate.withDayOfMonth(15));//2023-04-15

        System.out.println("currentDate.getDayOfWeek() = " + currentDate.getDayOfWeek());//TUESDAY
        System.out.println("currentDate.plusWeeks(12) = " + currentDate.plusWeeks(1));//Now===>2023-04-18  1 week Later===>2023-04-25

        //HOW TO GET CURRENT DATE IN A SPECIFIC ZONE
        System.out.println("LocalDate in Asia/Tokyo = " + LocalDate.now(ZoneId.of("Asia/Tokyo")));//2023-04-18
        System.out.println("currentDate(ZoneId.of(America/New_York)) = " + LocalDate.now(ZoneId.of("America/New_York")));//2023-04-17

        //HOW TO GO FUTURE AND PAST
        System.out.println("currentDate.plusYears(12).plusMonths(9).plusWeeks(3).plusDays(13) = " + currentDate.plusYears(12).plusMonths(9).plusWeeks(3).plusDays(13));
        System.out.println("currentDate.minusYears(6).minusMonths(9).minusWeeks(3).minusDays(13) = " + currentDate.minusYears(6).minusMonths(8).minusWeeks(3).minusDays(13));

        //Example 1: Jhon was born 12 years 5 months 11 days ago, type code to find the day name of Jhon's birthdate
        System.out.println("The day name of Jhon's birthdate is : " + currentDate.minusYears(12).minusMonths(5).minusDays(11).getDayOfWeek());

        //HOW TO COMPARE TWO DATES
        LocalDate dobTom=LocalDate.of(1986, Month.APRIL,23);
        LocalDate dobJhon=LocalDate.of(2017,Month.JANUARY,27);
        System.out.println("birthday of Tom is before Jhon's birthday = " + dobTom.isBefore(dobJhon));
        System.out.println("birthday of Tom is after Jhon's birthday = " + dobTom.isAfter(dobJhon));

     //Example 2: Type code for a booking application.
        //           If booking date is before current date give an error message like "Booking date cannot be past date"
        //           If booking date equals current date give a message like "We will call you when we have availability"
        //           If booking date is after current date give a message like "The ticket was booked"

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter year of booking");
        int bookingYear=scan.nextInt();
        System.out.println("Please enter month of booking");
        int bookingMonth=scan.nextInt();
        System.out.println("Please enter day of booking");
        int bookingDay=scan.nextInt();

        LocalDate booking=LocalDate.of(bookingYear,bookingMonth,bookingDay);
        //System.out.println(booking);

        if (booking.isBefore(currentDate)){
            System.out.println("Booking date cannot be past date");
        } else if (booking.isEqual(currentDate)) {
            System.out.println("We will call you when we have availability");

        }else {
            System.out.println("The ticket was booked");
        }

        //Example 3: Type code to find the day name of your birth.
        LocalDate myBirthDay=LocalDate.of(2023,04,14);
        System.out.println("myBirthDay = " + myBirthDay);
        DayOfWeek dayOfWeek=myBirthDay.getDayOfWeek();

        //How to format date
        LocalDate current=LocalDate.now();
        System.out.println("current = " + current); //current = 2023-04-18

        //"m" is reserved for minute,that is why we use "M" for month
        //"M" makes the month number single digit if it is less than 10
        //"MM" makes the month number TWO digit if it is less than 10
       //"MMM" gives you first three chracters of month name
       //"MMMM" gives you full name of month name
       //"yyyy" gives you the year in 4 digits
       //"yy" gives you the last two digits of the year
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String myDate=dtf.format(current);
        System.out.println("myDate = " + myDate);      //myDate = 18/04/2023


    }


}
