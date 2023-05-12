package day06stringmanipulations;

public class StringManipulations02 {
    /*
            1)"=" means assignment operator, "==" is used to check equality in Java
        2)indexOf() returns the index of first occurrence of a specific character
        3)lastIndexOf() returns the index of last occurrence of a specific character
        4)equals() method is for checking if two Strings are exactly same or not.
        5)equalsIgnoreCase() method is for checking if two Strings are same or not by ignoring cases.
        6)Index of last character in a String is "length()-1"
            7)isEmpty() returns true just for empty Strings
        8)isBlank() returns true for empty Strings and the Strings have just space character
     */
    public static void main(String[] args) {
//Example 1: Type code to check if a specific character is unique in a String or not
        //           Hello ==> H is unique, e is unique, o is unique

        String character="Hello";
        char ch='l';
        boolean isTrue=character.indexOf(ch)==character.lastIndexOf(ch);
        System.out.println("Is "+ch+" unique "+isTrue);

        //Example 2: Type code to check if first and the last character are same in a String
        //           ANKARA ==> true     Ankara ==> true      Miami ==> false

        String city="Ankara";
        String firstch=city.substring(0,1);
        String lastch=city.substring(city.length()-1);
        boolean isSame=firstch.equalsIgnoreCase(lastch);
        System.out.println("Are first and last characters same? "+isSame);

//Example 3: Type code to check if a String is empty String or not
        //           "" ==> true  -  " " ==> false because there is space character

        String str="";
        //1.Way
        boolean isEmpty=str.length()==0;
        System.out.println(isEmpty);

        //2.Way
        boolean isEmpty2=str.isEmpty();
        System.out.println(isEmpty2);

        //Example 4: Type code to check if a String is empty or has just space character or not
        //           "" ==> true   -    " " ==> true    -    "       " => true

        String st="     ";

        boolean isBlank=st.isBlank();
        System.out.println(isBlank);



    }

}
