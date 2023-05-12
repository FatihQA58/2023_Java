package day09nestedternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {
          /*
                Type java code by using nested ternary.
                Write a program to check if a year is "leap year" or not.
                i) If the year is divisible by 100 then it must be divisible by 400. ==> 1600+, 2000+, 1800-
                ii) If a year is not divisible by 100 then it must be divisible by 4. ==> 2004+, 1996+, 2021-
         */
        int year=2006;
        String isLeapYear= year %100 ==0 ? (year%400==0?" THE YEAR IS LEAP YEAR " : " THE YEAR IS LEAP YEAR "):(year%4==0?" THE YEAR IS LEAP YEAR " : " THE YEAR IS LEAP YEAR ");
        System.out.println(isLeapYear);

         /*
            Type code to check the password
            If it has more than 8 characters, initial should be 'i'
            If it has no more than 8 characters initial should be 'K'
            Solve the task by using nested-ternary
      */
        String pswrd="aSdkIi25";
       String container=pswrd.length()>8 ?(pswrd.charAt(0)=='i'?"PASSWORD IS OK":"PASSWORD IS FOUT"):(pswrd.charAt(0)=='K'?"PASSWORD IS OK":"PASSWORD IS FOUT");
        System.out.println(container);

    }
}
