package day05stringmanipulations;

public class StringManipulations01 {
    /*
        1)toUpperCase() method converts all characters to upper cases
        2)toLowerCase() method converts all characters to lower cases
        3)substring(s, e); takes the characters starting from "s"(inclusive) ending at "e"(exclusive)
        4)substring(s); takes the characters starting from "s"(inclusive) to the end of the String
        5)split("a"); method splits the String from the given character.
     */
    public static void main(String[] args) {
     //Example 1: Change the full name like initials are in upper cases, other characters are in lower cases
        //           TOM HANKS ==> Tom Hanks    or  tom hanks ==> Tom Hanks
       //1.WAY
        String name="tOm HanKs";
       String intialOfFirstName=name.substring(0,1).toUpperCase();
       String restOfTheFirstName=name.split(" ")[0].substring(1).toLowerCase();
       String firstName=intialOfFirstName+restOfTheFirstName;
       System.out.println(firstName);

        String initalOfLastName=name.split(" ")[1].substring(0,1).toUpperCase();
        String restOfTheLastName=name.split(" ")[1].substring(1).toLowerCase();
        String lastName=initalOfLastName+restOfTheLastName;
        System.out.println(lastName);
        System.out.println(firstName+" "+lastName);

        //2.WAY
        String nameLowerCase=name.toLowerCase();
        String initalOfFirstName=nameLowerCase.substring(0,1).toUpperCase();
        String restOfFirstName=nameLowerCase.split(" ")[0].substring(1);
        String initalOfTheLastName=nameLowerCase.split(" ")[1].substring(0,1).toUpperCase();
        String restOfLastName=nameLowerCase.split(" ")[1].substring(1).toLowerCase();
        System.out.println(initalOfFirstName+restOfFirstName+" "+initalOfTheLastName+restOfLastName);



    }

}
