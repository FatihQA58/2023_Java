package day29collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01  {
    /*
            Sets are for storing "unique data" like email addresses, student ids etc.
            There are 3 sets i)HashSet:
                                "Hash"ing is a technique to create unique codes for data
                                HashSet does not put the elements in any order. HashSet puts the elements in random order.
                                HashSet is so fast because it does not spend time to order the elements.
                                You can store just a single "null" in a HashSet
                             ii)LinkedHashSet:
                                LinkedHashSet puts the elements in "insertion order"
                                LinkedHashSet is slower than HashSet because it spends time in ordering elements
                             iii)TreeSet:
                                TreeSet puts the elements in "natural order"
                                Putting elements in natural order needs too much time that is why TreeSet is the slowest set.
                                TreeSet does not accept null as element
     */
    public static void main(String[] args) {
        HashSet hs=new HashSet<>();
        hs.add("Germany");
        hs.add("Albania");
        hs.add("Belgium");
        hs.add("USA");
        hs.add("UK");
        hs.add("Albania");//When you add a data repeatedly Java does not give error, but it accepts it just once
        hs.add("Turkey");
        hs.add("null");
        System.out.println(hs);//[USA, Turkey, Belgium, null, UK, Germany, Albania]

        LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(5);
        lhs.add(19);
        lhs.add(12);
        lhs.add(23);
        lhs.add(null);
        System.out.println(lhs);//[12, 5, 19, 23, null]

        LinkedHashSet<Integer>mhs=new LinkedHashSet<>();
        mhs.add(43);
        mhs.add(19);
        mhs.add(6);
        mhs.add(50);
        mhs.add(23);
        mhs.add(65);
        System.out.println(mhs);//[43, 19, 6, 50, 23, 65]

        lhs.retainAll(mhs);
        System.out.println(lhs);//[19, 23]
        System.out.println(mhs);//[43, 19, 6, 50, 23, 65]

        long t1=System.nanoTime();
        HashSet hs2=new HashSet<>();
        hs2.add("Germany");
        hs2.add("Albania");
        hs2.add("Belgium");
        hs2.add("USA");
        hs2.add("UK");
        hs2.add("Albania");
        hs2.add("Turkey");
        hs2.add("null");
        System.out.println(hs2);//[USA, Turkey, Belgium, null, UK, Germany, Albania]

        long t2=System.nanoTime();
        TreeSet<String>ts=new TreeSet<>();
        ts.add("Germany");
        ts.add("Albania");
        ts.add("Belgium");
        ts.add("USA");
        ts.add("UK");
        ts.add("Albania");
        ts.add("Turkey");
        System.out.println(ts);//[Albania, Belgium, Germany, Turkey, UK, USA]
        long t3=System.nanoTime();

        HashSet hs3=new HashSet<>();
        hs3.add("Germany");
        hs3.add("Albania");
        hs3.add("Belgium");
        hs3.add("USA");
        hs3.add("UK");
        hs3.add("Albania");
        hs3.add("Turkey");
        hs3.add("null");
        TreeSet<String>ts2=new TreeSet<>(hs3);
        System.out.println(ts2);
        long t4=System.nanoTime();
        /*
            If you need to store "unique elements" in "natural order" do not use TreeSet to add elements because it is so slow.
            Use HashSet to add elements then convert the HashSet to TreeSet.
            So you will have "unique elements" in "natural order" and you will not be slow.
        */
        System.out.println("Duration of HashSet "+(t2-t1));
        System.out.println("Duration of TreeSet "+(t3-t2));
        System.out.println("Duration of first creation HashSet after put TreeSet "+(t4-t3));
        System.out.println("HashSet is "+((t3-t2)/(t2-t1))+" times faster");
        System.out.println("Before creat HashSet after put TreeSet is "+((t3-t2)/(t4-t3))+" times faster");

    }
}
