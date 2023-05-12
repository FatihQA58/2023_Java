package smallStudyGroep_SSG;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {

        // function(6);
        // function(6,2);
        function(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sumOfVarargs(3, 8, 7, 6));
        System.out.println(concatenateStrings("Ahmet", " is", " a", " good", " man"));

        System.out.println(maxVarargsValue(3, 4, 12, 36, 17, 88, 9));
    }
    /*public static void function(int a){
        System.out.println(a);
    }
    public static void function(int a,int b){
        System.out.println(a+","+b);
    }

     */

    public static void function(int... a) {
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);

    }

    //Create a method called sumVarargs that accepts a variable number of int arguments and return sum of all integers
    //Test the method by calling it with various arguments
    public static int sumOfVarargs(int... a) {
        int sum = 0;
        for (int w : a) {
            sum += w;
        }
        return sum;
    }

    public static String concatenateStrings(String... a) {
        String str = "";
        for (String w : a) {
            str += w;
        }
        return str;
    }

    //Function to find the maximum value among a variable number of input arguments using varargs
   /* -------->1.YOL :
   public static int maxVarargsValue(int... a) {
        Arrays.sort(a);
        return a[a.length-1];
    }*/
    //-------->2.YOL :
    public static int maxVarargsValue(int... b) {
        int max=Integer.MIN_VALUE;
        for (int w:b) {
            if (max<w){
                max=w;
            }

        }
        return max;
    }

}