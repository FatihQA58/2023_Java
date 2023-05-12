package day09nestedternaryswitch;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
         /*
        Switch Statement can be used with String, int, char but cannot be used with long, double, float, boolean
     */
        //Example 1: Create a calculator does +, -, *, /, %

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the operation among +, -, *, /, % ");
        char oprtion=input.next().charAt(0);

        System.out.println("Please enter two integers...");
        int num1=input.nextInt();
        int num2=input.nextInt();

        switch (oprtion){
            case '+':
                System.out.println(num1+"+"+num2+"="+(num1+num2));
                break;
            case '-':
                System.out.println(num1+"-"+num2+"="+(num1-num2));
                break;
            case '*':
                System.out.println(num1+"*"+num2+"="+(num1*num2));
                break;
            case '/':
                System.out.println(num1+"/"+num2+"="+(num1/num2));
                break;
            case '%':
                System.out.println(num1+"*"+num2+"/"+"100"+"="+(num1*num2/100));
                break;
            default:
                System.out.println("Undefined operation");
        }
    }
}
