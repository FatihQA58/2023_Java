package day10forloops;

public class ForLoops02 {
    public static void main(String[] args) {
        //Example 1: Put "*" between 2 consecutive characters and to the end in a String.
        //For example; Java ==> J*a*v*a*
        String str = "Java";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "*");
        }
        System.out.println();

        //Example 2: Type code to print unique characters in a String. Hello ==> Heo
        String t = "Hello";
        for (int k = 0; k < t.length(); k++) {
            char ch = t.charAt(k);
            if (t.indexOf(ch) == t.lastIndexOf(ch)) {
                System.out.print(ch);
            }
        }
        System.out.println();
        //Example 3: Type code to reverse a String
        //           For Example: Tom ==> moT
        String reverse = "Tom";
        String rev = "";
        String rev2 = "";
        //1.WAY
        for (int m = 0; m < reverse.length(); m++) {
            char ch2 = reverse.charAt((reverse.length() - 1) - m);
            rev = rev + ch2;
        }
        System.out.println(rev);
        //2.WAY
        for (int i = reverse.length() - 1; i >= 0; i--) {

            rev2 = rev2 + reverse.charAt(i);
        }
        System.out.println(rev2);
    }
}