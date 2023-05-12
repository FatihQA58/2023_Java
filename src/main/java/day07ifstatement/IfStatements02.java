package day07ifstatement;

import java.util.Scanner;

public class IfStatements02 {

    //Example 1: Ask user to enter day name then print if the day name is week day or weekend day
    //           Monday --> Weekday    Sunday --> Weekend day
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a day");
        String dayName=input.next();

        // 1.way
        if(dayName.equalsIgnoreCase("Maandag")){
            System.out.println("Today is weekday");
        } else if (dayName.equalsIgnoreCase("Dinsdag")) {
            System.out.println("Today is weekday");
        } else if (dayName.equalsIgnoreCase("Woensdag")) {
            System.out.println("Today is weekday");
        } else if (dayName.equalsIgnoreCase("Donderdag")) {
            System.out.println("Today is weekday");
        } else if (dayName.equalsIgnoreCase("Vrijdag")) {
            System.out.println("Today is weekday");
        } else if (dayName.equalsIgnoreCase("Zaterdag")) {
            System.out.println("Today is weekend day");
        } else if (dayName.equalsIgnoreCase("Zondag")) {
            System.out.println("Today is weekend day");
        }else{
            System.out.println("Lutfen bir gun ismi giriniz.");
        }

        // 2.WAY
        boolean isWeek=dayName.equalsIgnoreCase("Dinsdag")  ||
                dayName.equalsIgnoreCase("Woensdag")        ||
                dayName.equalsIgnoreCase("Donderdag")       ||
                dayName.equalsIgnoreCase("Vrijdag")         ||
                dayName.equalsIgnoreCase("Maandag")         ;
        boolean isWeekendDay=dayName.equalsIgnoreCase("Zaterdag") || dayName.equalsIgnoreCase("Zondag");
        if (isWeek){
            System.out.println("Today is weekday");
        } else if (isWeekendDay) {
            System.out.println("Today is weekend day");

        }else {
            System.out.println("Lutfen bir gun ismi giriniz.");
        }


    }
}
