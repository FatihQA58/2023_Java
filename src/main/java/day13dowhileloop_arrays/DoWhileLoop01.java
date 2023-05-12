package day13dowhileloop_arrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
         /*
            Username is "admin", Password is "pwd123"

            Ask user to enter username and password
            User should see "Enter your username and password" message

            If user enters correct credentials, he should get "You are in your account!" message

            Otherwise, he should see "Enter your username and password" message 3 times
            After 3 times he should get "Your account is blocked" message

       */

        Scanner input =new Scanner(System.in);

        int i=1;
        do{
            if(i==3){
                System.out.println("Your account is blocked");
                break;
            }
            System.out.println("Please enter username and password");
            String usrname=input.nextLine();
            String pssword=input.nextLine();
            if (usrname.equals("admin123")&&pssword.equals("Fedcrfv")){
                System.out.println("You are in your account!");
                break;
            }else{
                System.out.println("Your password and username is wrong");
            }
            i++;
        }while (true);
    }
}
