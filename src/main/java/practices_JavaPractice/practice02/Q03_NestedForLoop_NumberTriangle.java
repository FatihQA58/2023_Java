package practices_JavaPractice.practice02;

import java.util.Scanner;

public class Q03_NestedForLoop_NumberTriangle {
    /*
Type code to ask user to enter the number of row
and print the shape below according to that number:

 1
 2  3
 4  5  6
 7  8  9  10
 11 12 13 14 15
 16 17 18 19 20 21

 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of row");
        int numOfRow = scan.nextInt();
        int counter = 0;

        for (int i=0; i<numOfRow; i++) {
            for (int j=0; j<=i; j++){

                counter++;
                System.out.print(counter+" ");
            }
            System.out.println();
        }
    }
}