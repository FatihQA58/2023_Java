package day12whileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
         //Example 1: Type code to print integers from 3 to 6 on the console

        //1.Way:
        for (int i=3; i<7; i++){
            System.out.println(i+" ");
        }
        System.out.println();

        //2.Way
        int i=3;
        while(i<7){
            System.out.println(i+" ");

            i++;
        }

        //Example 2: Type code to print odd integers from 10 to 4 on the console

        int k=10;

        while (k>3){
            if(k%2!=0){
                System.out.print(k+" ");
            }
            k--;
        }
        System.out.println();
        //Example 3: Type code to find the sum of the even integers from 10 to 13

        int num=10;
        int sum=0;

        while (num<14){
            sum=sum+num;
            num+=2;
        }
        System.out.println(sum);
        //Example 4: Type java code by using while loop,
        //           Write a program that prompts the user to input an integer.
        //           It should then find the sum of the digits of that number.
        //           123 ==> 1+2+3 = 6

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter an integer");
        int nummer=input.nextInt();
        nummer=Math.abs(nummer);
        int summ=0;
        while (nummer>0){
            summ=summ+nummer%10;;
            nummer/=10;

        }
        System.out.println(summ+" ");

        /*
            Example 5: Type java code by using while loop,
                    Write a program that prompts the user to input a number.
                    It should then print the multiplication table of that number.
                    3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
        */


        System.out.println("Please enter an integer");
        int number=input.nextInt();
        number=Math.abs(number);
        int mul=1;
        while (mul<11 ){
            System.out.println(number+" * "+mul+" = "+number*mul);
            mul++;
        }

    }
}
