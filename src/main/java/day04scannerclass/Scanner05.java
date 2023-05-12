package day04scannerclass;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Example 1: Ask user to enter width and the length of a rectangle then calculate the perimeter and the area
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter length of the rectangle");
        short lengthOfRectangle=input.nextShort();
        System.out.println("Please enter width of the rectangle");
        short widthOfRectangle=input.nextShort();


        System.out.println("Perimeter of Rectangle : "+2*(lengthOfRectangle+widthOfRectangle));
        System.out.println("Area of Rectangle : "+(lengthOfRectangle*widthOfRectangle));
    }
}
