package day04scannerclass;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Example 1: Ask user to enter 5 digits number like 45673
        //           Print the sum of the first two and the last two digits.
        //           45673 ==> 45 + 73 = 118
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a 5 digit numbers");
        int num=input.nextInt();
        System.out.println(num);
        int firstTwonums=num/1000;
        System.out.println(firstTwonums);
        int laatsteTweeNums=num%100;
        System.out.println(laatsteTweeNums);
       System.out.println("The sum of the nums : "+(firstTwonums+laatsteTweeNums));


    }
}
