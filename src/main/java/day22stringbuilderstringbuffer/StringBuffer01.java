package day22stringbuilderstringbuffer;

public class StringBuffer01 {
    /*
      1)StringBuffer is a class in Java, it gives us String
      2)StringBuffer is "mutable" like StringBuilder
      3)StringBuffer is "thread-safe" and "synchronized" but StringBuilder neither "thread-safe" nor "synchronized"
      4)StringBuffer was created in Java-5, StringBuilder was created after StringBuffer
      5)StringBuilder has fewer features than StringBuffer that is  why it works faster than StringBuffer

      If you need String, you have 3 options in Java
      i)String Class: It gives you "immutable" Strings
      ii)StringBuilder: It gives you "mutable", "non-thread-safe", "non-synchronized" Strings
      iii)StringBuffer: It gives you "mutable", "thread-safe", "synchronized" Strings
   */
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("Python");
        StringBuffer sb2=new StringBuffer("python");

        //If the Strings are completely same compareTo() method returns zero
        //If the first String is coming after the secondString the result will be positive
        //If the first String is coming before the secondString the result will be negative
        int compare=sb1.compareTo(sb2);
        System.out.println("compare = " + compare);//compare = -32

        sb1.setCharAt(2,'T');
        System.out.println(sb1);

        CharSequence stuk=sb1.subSequence(1,4);
        System.out.println(stuk);

    }
}
