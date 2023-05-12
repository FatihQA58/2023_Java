package day11forloopwhileloop;

public class ForLoop01 {
    public static void main(String[] args) {
        //Example 1: Type code to find the sum of integers from 5 to 26
       int sum=0;
        for (int i=5; i<27; i++){
         sum=sum+i;
        }
        System.out.println(sum);

        System.out.println();

        //Example 2: Type code to find the multiplication of integers from 5 to 9
        int mul=1;
        for (int i=5; i<10; i++){
            mul=mul*i;
        }
        System.out.println(mul);

        //Example 2: Type code to find the sum of the digits of integers

        int num=-3587;
        num=Math.abs(num);
        int sumOfDigits=0;

        for (int i=num;  num>0;   num/=10){
            sumOfDigits=sumOfDigits+num%10;

        }
        System.out.println(sumOfDigits);
    }
}
