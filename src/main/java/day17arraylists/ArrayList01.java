package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList01 {
    public static void main(String[] args) {
        //Example 1: Type code to check if the elements in a String ArrayList are in alphabetical order or not

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Berlin");
        cities.add("Amsterdam");
        cities.add("Utrecht");
        cities.add("Atina");
        System.out.println(cities);

        ArrayList<String> new_Cities = new ArrayList<>();
        new_Cities.addAll(cities);
        System.out.println(new_Cities);

        Collections.sort(new_Cities);// sort() method puts the list elements in "alphabetical order" if the elements are String
        // sort() method puts the list elements in "ascending order" if the elements are numbers
        //"alphabetical order" and "ascending order" are called "Natural Order"
        System.out.println(new_Cities);

        if (cities.equals(new_Cities)) {
            System.out.println("Elements are in alphabetical order");
        } else {
            System.out.println("Elements are not in alphabetical order");
        }

        //Example 2: Type code to find the closest values in an Integer List
        //           [12, 31, 15, 32, 54] ==> 31 and 32
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(31);
        ages.add(15);
        ages.add(32);
        ages.add(54);

        Collections.sort(ages);
        System.out.println(ages);//[12, 15, 31, 32, 54]

        int difference = ages.get(1) - ages.get(0);
        for (int i = 1; i < ages.size(); i++) {
            difference = Math.min(difference, ages.get(i) - ages.get(i - 1));

        }
        System.out.println(difference);

        for (int i = 1; i < ages.size(); i++) {
            if (difference == (ages.get(i) - ages.get(i - 1))) {
                System.out.println(ages.get(i - 1) + " and " + ages.get(i) + " are closest values");
            }
        }

        //Example 3: Type code to find the sum of the elements if they are different from 31 and 54
        //           [12, 31, 15, 32, 54] ==> 12 + 15 + 32 = 59
        ArrayList<Integer> sumOfNums = new ArrayList<>();
        sumOfNums.add(12);
        sumOfNums.add(31);
        sumOfNums.add(15);
        sumOfNums.add(32);
        sumOfNums.add(54);

        int sum = 0;
        for (int w : sumOfNums) {
            if (w == 54 || w == 31) {
                continue;
            }
            sum = sum + w;
        }
        System.out.println(sum);

        //Example 4: Type code to check if all elements are unique or not in a List
        //           [12, 31, 15, 32, 54] ==> Unique       [12, 31, 12, 32, 54] ==> Not Unique
        ArrayList<Integer> unique = new ArrayList<>();
        unique.add(13);
        unique.add(31);
        unique.add(12);
        unique.add(32);
        unique.add(54);

        //1.Way
        int counters = 0;
        for (int i = 0; i < unique.size(); i++) {
            if (unique.indexOf(unique.get(i)) != unique.lastIndexOf(unique.get(i))) {
                System.out.println("All elements are not unique.");
                break;
            } else {
                counters++;
            }
        }
        if (counters == unique.size()) {
            System.out.println("All elements are unique.");


            //2.Way
            int counter = 0;
            for (int w : unique) {
                if (unique.indexOf(w) != unique.lastIndexOf(w)) {
                    System.out.println("All elements are not unique.");
                    break;
                } else {
                    counter++;
                }
            }
            if (counter == unique.size()) {
                System.out.println("All elements are unique.");
            }

        }

    }
}
