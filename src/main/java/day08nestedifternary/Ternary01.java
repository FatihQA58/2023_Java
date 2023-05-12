package day08nestedifternary;

public class Ternary01 {
    public static void main(String[] args) {
        //Example 1: Type code to check if  a number is positive or not

        //Use if - else

        int num= -12;

        if (num>0){
            System.out.println("Positive");
        }else{
            System.out.println("Not Positive");
        }

        //Use ternary statement
String result=num>0 ? "Positive" : "Negative" ;
        System.out.println(result);

        //Example 2: Type code to check if a number is even or odd
        int num2=13;

        String resultaat=num2%2==0 ? " Even " : " Odd ";
        System.out.println(resultaat);

        //Example 3: Type code to find the minimum of two integers
        int eerst=123;
        int tweede=12;

        int min = eerst>tweede ? eerst : tweede ;
        System.out.println(min);

        //Example 4: Type code to calculate the "absolute value" of a number
        //           5 ==> 5        -5 ==> -1*-5         0 ==> 0

        int deger=-5;

        int abs = deger>0 ? deger : deger*-1;
        System.out.println(abs);

        //Example 5:  You have 2 integers;
        //            If both of the integers are positive do multiplication.
        //            Otherwise, return "I do not know how to multiply"

        int a=12;
        int b=-6;

        Object mul=(a>0 && b>0) ? a*b : "I do not know how to multiply";
        System.out.println(mul);


        //Example 6: You have 2 integers
        //           If both are positive do addition
        //           Otherwise return the maximum one

        int c=22;
        int d=-6;

        int add=(c>0 && d>0) ? (c+d) : (c>d ? c : d);
        System.out.println(add);

    }
}
