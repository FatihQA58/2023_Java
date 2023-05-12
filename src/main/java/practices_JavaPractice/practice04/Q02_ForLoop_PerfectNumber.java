package practices_JavaPractice.practice04;

import java.util.Scanner;

public class Q02_ForLoop_PerfectNumber {
      /*
   Type code to ask user to enter an integer to check if it is 'Perfect Number' or not."
   A perfect number is a positive integer that is equal to the sum of all its proper divisors.
   6 = 1+2+3, 28 = 1 + 2 + 4 + 7 + 14, (496 and 8128)
    */
      public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          System.out.println("Please enter a number");
          int num= Math.abs(scan.nextInt());
          int sum=0;

          for(int i=1; i<num; i++){
              if(num%i==0){
                  sum+=i;
              }
          }
          if (sum==num){
              System.out.println(num+" is a perfect number");
          }else{
              System.out.println(num+" is NOT a perfect number");
          }
      }
}
