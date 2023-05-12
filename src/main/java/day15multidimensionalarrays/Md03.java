package day15multidimensionalarrays;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {
        //Example 1: Type code to find the sum of the maximum and minimum values in a multidimensional array
        //           { {5, 0}, {-2, 14}, {65, -12, 23} } ==> -12 + 65 = 53

        //1.Way:
        int [][]a={ {5, 0}, {-2, 14}, {65, -12, 23} };

        int max_Value =a[0][0];
        int min_Value =a[0][0];
        for (int[] w:a) {
            for (int u:w) {
                if(max_Value<u){
                    max_Value=u;
                }
                if(min_Value>u){
                    min_Value=u;
                }
                System.out.print(u+" ");
            }
        }
        System.out.println();
        System.out.println(max_Value);
        System.out.println(min_Value);
        System.out.println(max_Value+min_Value);

        //2.Way:
        int [][]b={ {5, 0}, {-2, 14}, {65, -12, 23} };

        int max_V =a[0][0];
        int min_V =a[0][0];
        for (int[] w:a) {
            for (int u:w) {
                max_V = Math.max(u, max_V);
                min_V = Math.min(u, min_V);
                System.out.print(u+" ");
            }
                }

        System.out.println();
        System.out.println(max_V);
        System.out.println(min_V);
        System.out.println(max_V+min_V);
    }
}
