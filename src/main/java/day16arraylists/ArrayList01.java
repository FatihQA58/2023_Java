package day16arraylists;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ArrayList01 {
    public static void main(String[] args) {
        /*
        1)ArrayLists are for storing multiple data in the same data type.
        2)Arrays are fixed in length but ArrayLists are flexible in size.
        3)If Arrays are not good why did not Java remove Arrays from Java structure?
          Because Arrays use memory so less, and Arrays are so fast.
          If you are sure about the length use Array instead of ArrayList
        4)Arrays can store just "primitive data" and "references of non-primitive data" but
          ArrayLists can store just "non-primitive data"
        5)Arrays are poor in methods but ArrayLists are so rich in methods
     */
        //How to create an ArrayList
        ArrayList<String> names=new ArrayList<>();
        System.out.println(names);// [ ]

        ArrayList<String>cities=new ArrayList<>();
        cities.add("Hoegeveen");
        cities.add("Coevorden");

        //How to add elements into an ArrayList
        //add() method adds the elements into the List in insertion order.
        names.add("Erkan");
        names.add("Fatih");
        names.add("Metin");

        //addAll() method is for adding a list into another list
        names.addAll(cities);
        //addAll() method is for adding a list into another list at the given index
        names.addAll(2,cities);

        //add(index, element) puts the given element into the given index
        names.add(1,"Ernst");

        System.out.println(names);

        //How to check if a List is empty or not
        ArrayList<String>countries=new ArrayList<>();
        countries.add("Turkey");
        countries.add("USA");

        //1.Way:
        //Get the number of elements in the list, if it is zero it means the list is empty
        if (countries.size()==0){// size() method gives you the number of elements in a list
            System.out.println("Array is empty");
        }else{
            System.out.println("Array is not empty");
        }

        //2.Way: Recommended
        if (countries.isEmpty()){// size() method gives you the number of elements in a list
            System.out.println("Array is empty");
        }else{
            System.out.println("Array is not empty");
        }
        //Example 1: Add "TR" to the list if it does not exist
        if (!countries.contains("NL")){
            countries.add("USA");

        //Example 2: Change the second element to America
            countries.set(1,"America");
            System.out.println(countries);
        }

        //Example 3: Remove elements if the length is 2
            //remove() method cannot be used in for-each loop
//        for(String w : countries){
//            if(w.length()==2){
//                countries.remove(w);

            for (int i=0; i<countries.size(); i++){
                if (countries.get(i).length()==3){
                    countries.remove(i);
          }
       }
        System.out.println(countries);

        //Example 4: Create an Integer ArrayList and remove a specific element
        ArrayList<Integer> ages=new ArrayList<>();
        ages.add(12);
        ages.add(21);
        ages.add(32);
        ages.add(43);
        System.out.println(ages);

        //If you use integer in remove() method parenthesis, Java will accept it as index.
        //If you want to make it Integer element, use auto boxing like (Integer)23
        ages.add((Integer) 21);
        System.out.println(ages);

        //Example 5: Create an Integer ArrayList and remove multiple elements
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(12);
        nums.add(21);
        nums.add(32);
        nums.add(43);
        System.out.println(nums);

        ArrayList<Integer>height=new ArrayList<>();
        height.add(12);
        height.add(21);
        System.out.println(height);

        nums.removeAll(height);
        System.out.println(nums);
        System.out.println(height);







    }
}
