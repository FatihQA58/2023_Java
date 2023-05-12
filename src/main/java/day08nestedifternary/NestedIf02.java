package day08nestedifternary;

import java.util.Scanner;

public class NestedIf02 {
    /*
                Type java code by using nested if.
                Write a program to check if a year is "leap year" or not.
                i) If the year is divisible by 100 then it must be divisible by 400. ==> 1600+, 2000+, 1800-
                ii) If a year is not divisible by 100 then it must be divisible by 4. ==> 2004+, 1996+, 2021-
         */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a year");
        int leapYar=input.nextInt();

        if(leapYar%100==0){
            if (leapYar%400==0){
                System.out.println("The year is leap year");
            }else {
                System.out.println("The year isn't leap year");
            }
        } else    {
            if (leapYar%4==0){
                System.out.println("The year is leap year");
            }else {
                System.out.println("The year isn't leap year");
            }

       }
    }
}
