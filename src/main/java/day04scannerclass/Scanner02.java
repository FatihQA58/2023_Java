package day04scannerclass;

import java.util.Scanner;

public class Scanner02 {
    /*
    1)next() is for getting "just a single word" from the user
    2)nextLine() is for getting "all the String" user enters
    3)nextByte() is for getting integers/whole numbers from the user
    4) nextDouble() is for getting decimal values from the user
    5) nextBoolean()  is for getting boolean values from the user
     */
    public static void main(String[] args) {
        //Example 1: Ask user to enter i)Full name ii)Age iii)Height iv)Marital status
        //           Then print them on the console in different lines with a label

        //1.step: Create a Scanner object from scratch
        Scanner input=new Scanner(System.in);
        //2.Give a message to the user
        System.out.println("Please enter your full name");
        //3.Use a proper method to get the data from the user
        String gebruikerName=input.nextLine();
        System.out.println("Please enter your age");
        int gebruiker_age=input.nextInt();
        System.out.println("Please enter your height");
        double gebruiker_height=input.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried=input.nextBoolean();
        System.out.println("Your full Name : "+gebruikerName);
        System.out.println("Your age : "+gebruiker_age);
        System.out.println("Your height: "+gebruiker_height);
        System.out.println("Please tell me, Are you mrried? : "+isMarried);


    }

}
