package day13dowhileloop_arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

    /*
        Arrays are used to store multiple same data type objects.
         */

        //How to create an Array

        String stdNames[]=new String[5];
        System.out.println(Arrays.toString(stdNames));

        //How to add elements into an Array
        stdNames[2]="Tom";
        stdNames[4]="Alex";
        stdNames[0]="Mary";
        stdNames[1]="Jim";
        stdNames[3]="John";

        System.out.println(Arrays.toString(stdNames));

        //How to get a specific elements

        System.out.println(stdNames[3]);

        //How to get the number of elements from an Array

        System.out.println(stdNames.length);

        //Example 1: Find the total number of characters used in stdNames array elements

        //1.way:
        int sum=0;

        for (int i=0; i<stdNames.length; i++ ){

            sum=sum+stdNames[i].length();

        }
        System.out.println(sum);

        //1.way:
        int total=0;
        for (String w:stdNames) {
            total=total+w.length();

        }
        System.out.println(total);
    }


}
