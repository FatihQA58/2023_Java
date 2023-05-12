package practices_JavaPractice.practice02;

import java.util.Scanner;

public class Q01_IfStatement_SalaryBonus {
    public static void main(String[] args) {
         /*
 A company decided to give bonus of 5% of salary to employee if his/her year of
 service is 5 and more than 5 years.
 Ask user for their salary and year of service and print the net bonus amount.
 If employee can not get bonus, print how many more years he/she should work.

 EXAMPLE:
 INPUT   :   Year    => 4 year service
             Salary  => 4000

 OUTPUT :  You need to work 1 year(s) to get bonus
  */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter year of service");
        int yearOfService=Math.abs(input.nextInt());
        System.out.println("Please enter salary");
        double salary=Math.abs(input.nextDouble());

        if (yearOfService>4){
            System.out.println("You can get bonus : "+salary*0.05+"$");
        }else {
            System.out.println("You need "+(5-yearOfService)+" year voor getting bonus!");
        }



    }
}
