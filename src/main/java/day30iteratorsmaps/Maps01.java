package day30iteratorsmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Maps01 {
    /*
        1)Maps are for storing multiple data
        2)Maps use "key" - "value" structure to store multiple data
        3)"key"s are unique, "value"s can be repeatedly
        4)Every map element is called as "Entry"
        5)All map elements are called "EntrySet"
        6)All map elements are unique because "key" part is unique.
        7)There are 3 Maps in Java;
                i)HashMap:
                    a)HashMap puts the elements in "random order", HashMap is so fast
                    b)HashMap accepts "null" as key just once.
                    c)HashMap accepts multiple "null" in the "value" part
                ii)HashTable
                iii)TreeMap
     */
    public static void main(String[] args) {
        HashMap<String,Integer>cp=new HashMap<>();
        cp.put("USA",400);
        cp.put("Germany",83);
        cp.put("Albania",3);
        cp.put("Turkey",85);
        System.out.println(cp);//{USA=400, Turkey=85, Germany=85, Albania=3}

        //Example 1: Find the average population of the given countries
        double sum=0;
        for (Integer w: cp.values()) {//;// values() gives you all values in "value" part in a Collection
            sum+=w;
        }
        System.out.println("The average population of the given countries : "+sum/(cp.values().size()));

        //Example 2: Print the country names contains "r"
        Set<String> keys=cp.keySet();
        for (String w:keys) {
            if (w.contains("r")){
                System.out.print(w+" ");
            }

        }

        System.out.println();
        //How to get value of a specific key
        int populationOfTurkey=cp.get("Turkey");
        System.out.println(populationOfTurkey);// get() gives you the value of a specific key

        //How to check if keys have a specific key
        System.out.println(cp.get("Albania"));

        //How to check if keys have a specific key
        boolean isExist=cp.containsKey("Belgium");
        System.out.println(isExist);//false

        //How to check if values have a specific value
        boolean isExist2=cp.containsValue(85);
        System.out.println(isExist2);//true

        //Note: If you use same key with a different value in put(), it means you are updating the value
        //      cp.put("Germany", 83); then cp.put("Germany", 87); means you updated 83 to 87

        //How to update value of a key
        cp.replace("Germany",99);
        System.out.println(cp);//{USA=400, Turkey=85, Germany=99, Albania=3}

        cp.replace("Germany",99,100);
        System.out.println(cp);//{USA=400, Turkey=85, Germany=100, Albania=3}

        cp.putIfAbsent("UK", 50);
        System.out.println(cp);//{USA=400, Turkey=85, UK=50, Germany=100, Albania=3}

        //How to get all entries in a set
        Set<Map.Entry<String,Integer>>allEntries=cp.entrySet();
        for (Map.Entry<String,Integer> w:allEntries) {
            System.out.println(w.getValue()+" - "+w.getKey());
        }


    }

}
