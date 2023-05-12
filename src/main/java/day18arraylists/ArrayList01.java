package day18arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {
    public static void main(String[] args) {
        //Example 1: Type code to find the number of different elements in an arraylist
        //           [2, 3, 1, 2, 1, 5, 3] ==> [2, 3, 1, 5] ==> 4
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(2);
        nums.add(1);
        nums.add(5);
        nums.add(3);

        ArrayList<Integer> new_nums = new ArrayList<>();

        for (int w : nums) {
            /* if(!newNums.contains(w)){
                newNums.add(w);
            }*/
            if (new_nums.contains(w)==true) {
                continue;
            }
            new_nums.add(w);
        }
        System.out.println(new_nums.size());

        //Example 2: Type code to increase salaries in a list like if the salary is less than 10000
        //           increase it %20 otherwise increase it by adding 500

        ArrayList<Double>salaris=new ArrayList<>();
        salaris.add(9810.0);
        salaris.add(12450.0);
        salaris.add(15230.0);
        salaris.add(7500.0);
        salaris.add(10000.0);
        System.out.println(salaris);

        ArrayList<Double>new_Salaris=new ArrayList<>();

        for (Double w:salaris){
            /*  if(w<10000.0){
                salaries.set(salaries.indexOf(w), w*1.2);
            }else {
                salaries.set(salaries.indexOf(w), w+500);
            }*/
            if (w<10000.0){
                w+=w*20/100;
                new_Salaris.add(w);
            }else {
                w+=500;
                new_Salaris.add(w);

            }
            System.out.print(w+" ");
        }
        System.out.println();
        System.out.println(new_Salaris);

        //More methods in ArrayLists
        ArrayList<Integer>n=new ArrayList<>();
        n.add(2);
        n.add(3);
        n.add(1);
        n.add(2);
        n.add(1);

        ArrayList<Integer>p=new ArrayList<>();
        p.add(2);
        p.add(3);
        p.add(9);

        n.retainAll(p);
        System.out.println(n);// [2, 3, 2] ==> retainAll() keeps the common elements in the first list and remove the different elements
        System.out.println(p);// [2, 3, 9] ==> The list inside the retainAll() parenthesis does not change
    }
}