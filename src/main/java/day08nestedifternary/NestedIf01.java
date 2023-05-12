package day08nestedifternary;

import java.util.Scanner;

public class NestedIf01 {
    /*
        Note: Nested Structure in Java needs too much time to be executed, that is why if it is not mandatory
              we do not use Nested Structures
        Note: If something needs too much time in Java it is called "Time Consuming".
     */

    public static void main(String[] args) {
/*
            Ask user to enter a password
            If the initial of the password is uppercase
                Check if it is ‘A’ or not.
                If it is ‘A’ the output will be “Valid Password”
                otherwise the output will be “Invalid Password”
                For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid
            If the initial of the password is lowercase
                Check if it is ‘z’ or not.
                If it is ‘z’ the output will be “Valid Password”
                otherwise the output will be “Invalid Password”
                For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your password ");
        String pswrd=input.nextLine();

        if(pswrd.charAt(0)>='A' && pswrd.charAt(0)<='Z' ){
           if (pswrd.charAt(0)=='A'){
               System.out.println("Valid password");
           }else {
               System.out.println("Invalid password");
           }
        } else if (pswrd.charAt(0)>='a' && pswrd.charAt(0)<='z') {
            if (pswrd.charAt(0)=='A'){
                System.out.println("Valid password");
            }else {
                System.out.println("Invalid password");
            }
        }else {
            System.out.println("Invalid password");
        }
    }
}
