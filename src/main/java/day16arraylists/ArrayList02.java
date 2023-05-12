package day16arraylists;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
        //Example 1: Create 2 Character ArrayList and check if the lists are equal to each other or not
        ArrayList<Character>ch1=new ArrayList<>();
        ch1.add('J');
        ch1.add('a');
        ch1.add('v');
        ch1.add('a');
        System.out.println(ch1);

        ArrayList<Character>ch2=new ArrayList<>();
        ch2.add('J');
        ch2.add('a');
        ch2.add('v');
        ch2.add('a');
        System.out.println(ch2);

        if (ch1.equals(ch2)){//equals() checks i)size ii)elements iii)indexes of the elements
            System.out.println("They are equal");
        }else{
            System.out.println("They are equal");

            int idxOfFirstOccurence=ch1.indexOf('a');
            System.out.println(idxOfFirstOccurence);

            int idxOfLastOccurence=ch1.lastIndexOf('a');
            System.out.println(idxOfLastOccurence);
        }

        //Example 4: Type code to check if all elements are unique or not in a List
        //           [12, 31, 15, 32, 54] ==> Unique       [12, 31, 12, 32, 54] ==> Not Unique
        ArrayList<Character>letters=new ArrayList<>();
        letters.add('J');
        letters.add('a');
        letters.add('v');
        letters.add('a');

        for (Character w:letters) {
            if (letters.indexOf(w)==letters.lastIndexOf(w)){
                System.out.println("Unique chracters : "+w);
            }
        }

    }
}
