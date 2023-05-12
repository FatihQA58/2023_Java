package day31mapsexceptions;

import java.util.Hashtable;

public class HashTable {
    /*
    1)HashTable is "thread-safe" and "synchronized" but HashMap is not "thread-safe" not "synchronized"
    2)Hashtable puts the elements in random order.
    3)To be "thread-safe" and "synchronized" needs time, that is why Hashtable is slower than HashMap
    4)Hashtable does not accept null in "key"s and in " value"s
     */
    public static void main(String[] args) {
        Hashtable <String,Integer> ht=new Hashtable<>();
        ht.put("Ali Can",17);
        ht.put("Tom Hanks",65);
        ht.put("Brad Pitt",56);
        // ht.put("null",45);Hashtable does not accept null in "Key"s
        // ht.put("Mark Twain",null);Hashtable does not accept null in "Value"s

        System.out.println(ht);

        System.out.println(ht.get("Angelie Jolie"));//null
        System.out.println(ht.getOrDefault("Angelina jolie",-1));

        //System.out.println(ht.get("Ali Can")+ ht.get("Tom Hanks")+ ht.get("Brad Pitt")+ht.get("Angelina jolie"));
        System.out.println(ht.getOrDefault("Ali Can",0)+ ht.getOrDefault("Tom Hanks",0)+ ht.getOrDefault("Brad Pitt",0)+ht.getOrDefault("Angelina jolie",0));


    }
}
