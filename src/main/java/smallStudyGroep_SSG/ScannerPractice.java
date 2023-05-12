package smallStudyGroep_SSG;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       // int num=scan.nextInt();
       // System.out.println("User provided number is "+num);

        System.out.println("What is your name");
        String name=scan.nextLine();
        System.out.println("Hi "+name);
    }
}
