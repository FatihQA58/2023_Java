package practices_JavaPractice.practice01;

import java.util.Scanner;

public class Q03_Scanner {
    public static void main(String[] args) {
        //Type a code that calculates the hypotenuse.
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the length of the first leg of the right triangle");
        double firstLength=input.nextDouble();
        System.out.println("Please enter the length of the second leg of the right triangle");
        double secondLength=input.nextDouble();

        System.out.println(Math.sqrt((firstLength*firstLength)+(secondLength*secondLength)));

    }
}
