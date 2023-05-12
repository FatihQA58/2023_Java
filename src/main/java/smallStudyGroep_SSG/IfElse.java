package smallStudyGroep_SSG;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your firstName");
        String firstName=scan.nextLine();
        System.out.println("Please enter your lastName");
        String lastName=scan.nextLine();
        System.out.println("Please enter your age");
        int age=scan.nextInt();

        if (age>17){
            System.out.println("You are eligible");
        }else{
            System.out.println("You are not eligible");
        }
    }
}
