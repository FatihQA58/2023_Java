package day06stringmanipulations;

public class StringManipulations01 {
    /*
        1)endsWith() method checks the last character of a String if it is matching with a specific character
        2)charAt() method return a specific character by using index.
          Differences between substring() and charAt()
          i)charAt() is just for getting a single character, substring() can be used to get a single or multiple characters
          ii)charAt() returns "char" data type, substring() returns "String" data type.
        3)replace() method is for replacing a character with another character.
        4)valueOf() method converts Strings which is in numeric data format to numeric data.
        5)trim() method removes space character from the beginning and from the end.
     */
    public static void main(String[] args) {
        //Example 1: Check if a sentence start with uppercase and ends with dot
        //           I love Java. ==> true     i like Java. ==> false    I like Java ==> false   i like Java ==> false
        String s = "I love Java.";
        boolean isLastDat=s.endsWith(".");
       boolean isInitialUpper= s.charAt(0)>'A' && s.charAt(0)<'Z';
        System.out.println(isLastDat && isInitialUpper );

        //Example 2: Type code to find the sum of the prices given as Strings.
        //           $12.99 and $25.75 ==> 38.74

        String price_1="$12.99";
        String price_2="$25.75";

        String newPrice_1=price_1.replace("$","");
        String newPrice_2=price_2.replace("$","");

        double numPrice_1=Double.valueOf(newPrice_1);
        double numPrice_2=Double.valueOf(newPrice_2);

        System.out.println("Total price : "+numPrice_1+numPrice_2+"$");


        //Example 3: Get the initials of the first name and the last name in upper case.
        //           "Tom Hanks" ==> TH  -  "tom hanks" ==> TH  -  "    tom Hanks    " ==> TH
        String name="  Tom Hanks   ";
        String trimmedName=name.trim();
        System.out.println(trimmedName);

       String initial=trimmedName.substring(0,1).toUpperCase();
       String laatst=trimmedName.split(" ")[1].substring(0,1).toUpperCase();
        System.out.println(initial+"."+ laatst+".");


    }
}
