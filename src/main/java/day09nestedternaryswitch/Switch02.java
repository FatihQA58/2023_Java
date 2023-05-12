package day09nestedternaryswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 9 or 5");
        int num=input.nextInt();

        switch (num){
            case 1:
                System.out.println("Januari");
            case 2:
                System.out.println("Februari");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");
        }
    }
}
