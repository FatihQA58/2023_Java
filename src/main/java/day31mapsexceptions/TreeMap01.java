package day31mapsexceptions;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class TreeMap01 {
    /*
        1)TreeMap puts the entries in "natural order" by using "key"s
        2)TreeMap is the slowest Map, if you need entries to be in natural order;
          do not use TreeMap directly, use HashMap to put entries into the map then convert it to TreeMap to sort them
        3)TreeMaps are not "thread-safe" and are not "synchronized"
        4)TreeMap does not accept "null" in "key"s but accepts "null" in "value"s
   */
    public static void main(String[] args) {
        long t1=System.nanoTime();
        TreeMap<String,Integer>tm=new TreeMap<>();
        tm.put("Ali Can",17);
        tm.put("Tom Hanks",65);
        tm.put("Brad Pitt",56);
        tm.put("Ajda Pekkan",76);
        tm.put("Cuneyt Arkin",78);
        tm.put("Salih Kiraz",87);
        System.out.println(tm);//{Ajda Pekkan=76, Ali Can=17, Brad Pitt=56, Cuneyt Arkin=78, Salih Kiraz=87, Tom Hanks=65}

        long t2=System.nanoTime();

        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("Ali Can",17);
        hm.put("Tom Hanks",65);
        hm.put("Brad Pitt",56);
        hm.put("Ajda Pekkan",76);
        hm.put("Cuneyt Arkin",78);
        hm.put("Salih Kiraz",87);
        System.out.println(hm);//{Tom Hanks=65, Brad Pitt=56, Salih Kiraz=87, Cuneyt Arkin=78, Ajda Pekkan=76, Ali Can=17}

        long t3=System.nanoTime();

        System.out.println("HashMap "+((t2-t1)/(t3-t2))+" times faster than TreeMap");

        HashMap<String,Integer>hmm=new HashMap<>();
        hmm.put("Ali Can",17);
        hmm.put("Tom Hanks",65);
        hmm.put("Brad Pitt",56);
        hmm.put("Ajda Pekkan",76);
        hmm.put("Cuneyt Arkin",78);
        hmm.put("Salih Kiraz",87);
        TreeMap<String,Integer>tmm=new TreeMap<>(hmm);
        System.out.println(tmm);

        long t4=System.nanoTime();
        System.out.println("Before create HashMap after put TreeMap "+(t4-t3)/(t2-t1)+" times faster than TreeMap");

    }
}
