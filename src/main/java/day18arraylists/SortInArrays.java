package day18arraylists;

import java.util.Arrays;

public class SortInArrays {
    public static void main(String[] args) {
        char []arr={'b','e','a','d','h'};

        //How to sort array elements in natural order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //How to check if a specific element exists in an array or not
        //To check if a specific element exists in an array or not use binarySearch()
        int []brr={12,3,5,10,2};

        //1.Step: sort the array elements
        Arrays.sort(brr);

        //2.Step: Use binarySearch() method
        int brr1=Arrays.binarySearch(brr,12);
        System.out.println(brr1);// 4 ==> If the output is valid index(from 0 to ...), it means the array has the element


        int brr2=Arrays.binarySearch(brr,4);
        System.out.println(brr2);//-3

    }
}
