package practices_JavaPractice.practice04;

import java.util.Arrays;

public class Q05_Arrays_Anagram {
      /*
       Type code to check if two strings are Anagram or not.

       Anagram: A word or phrase made by using the letters of another word or phrase in a different order.
       Ex:
       dormitory → dirty room
       debit card → bad credit
       Eleven plus two → Twelve plus one
       A decimal point → I’m a dot in place
       Vacation time → I am not active
       */
      public static void main(String[] args) {
          String str1="dirty room";
          String []arr1=str1.toLowerCase().replaceAll(("[^a-z]"),"").split("");
          System.out.println(Arrays.toString(arr1));
          String str2="dormitory";
          String []arr2=str2.toLowerCase().replaceAll(("[^a-z]"),"").split("");
          System.out.println(Arrays.toString(arr2));

          Arrays.sort(arr1);
          System.out.println("arr1 = " + Arrays.toString(arr1));
          Arrays.sort(arr2);
          System.out.println("arr2 = " + Arrays.toString(arr2));

          if (Arrays.equals(arr1, arr2)){
              System.out.println("Strings are Anagram");
          }else{
              System.out.println("Strings are not Anagram");
          }

      }
}
