package day04scannerclass;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Example 1: Ask user to enter two numbers then do addition and multiplication operations with the numbers
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two numbers ");
        int num_1=input.nextInt();
        int num_2=input.nextInt();
        System.out.println("Äddition of the two numbers : "+(num_1+num_2));
        System.out.println("Multiplication of the two numbers : "+(num_1*num_2));
    }
}
