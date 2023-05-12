package day28interfacescollections;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class LinkedList01 {

    /*
    In Arraylist we have all elements with indexes.
    When you use ArrayList removing or adding elements makes the other elements
    re-indexed. This is not good practice because reindexing elements means too much work for Java.
    As a result ArrayList is not successful in removing and adding elements.

    That is why Java created a structure called "LinkedList".

    When you use LinkedList to remove or add elements it will
    change the pointer, it will not need to do reindexing for all other elements.
     As a result LinkedList is not successful in removing and adding elements.

     3)Search Operations are so easy in ArrayLists because every element has index like an address
     4)LinkedList is not successful in Search Operations because LinkedList does not use indexes which means
     elements do not have addresses but pointer for the following element/data


     */
    public static void main(String[] args) {
        //How to create LinkedList
        LinkedList<Character>m=new LinkedList<>();
        m.add('A');
        m.add(0,'H');
        m.addFirst('K');
        m.addLast('R');

        LinkedList<Character>n=new LinkedList<>();
        n.add('b');
        n.add('s');
        n.add('t');
        n.add('k');

        m.addAll(n); //[K, H, A, R, b, s, t, k]
        m.addAll(2,n);//[K, H, b, s, t, k, A, R, b, s, t, k]

        //remove() method removes the first node and returns the removed node
        System.out.println(m.remove());//K
        System.out.println(m);//[H, b, s, t, k, A, R, b, s, t, k]

        System.out.println(m.remove((Character) 'X'));//false 'X' was not removed
        System.out.println(m.remove((Character) 'R'));//true 'R' was removed
        System.out.println(m);//[H, b, s, t, k, A, b, s, t, k]

        System.out.println(m.remove(4));//k
        System.out.println(m);//[H, b, s, t, A, b, s, t, k]

        System.out.println(m.removeFirstOccurrence('s'));//true
        System.out.println(m);//[H, b, t, A, b, s, t, k]

        System.out.println(m.removeLastOccurrence('t'));//true
        System.out.println(m);//[H, b, t, A, b, s, k]

        //Removes and returns the first element from this list
        System.out.println(m.removeFirst());//H
        System.out.println(m);//[b, t, A, b, s, k]

        System.out.println(m.removeLast());//k
        System.out.println(m);//[b, t, A, b, s]

        LinkedList<Integer>r=new LinkedList<>();
        r.add(12);
        r.add(5);
        r.add(14);
        r.add(12);
        r.add(1);
        System.out.println(r);

        //Removes and returns the first element of this list.
        //This method is equivalent to removeFirst().
        //cut+paste
        System.out.println(r.pop());//12
        System.out.println(r);//[5, 14, 12, 1]

        /*
            removeFirst() + pop()
            Removes and returns the first element from this list.
            Returns:the first element from this list
            Throws:NoSuchElementException – if this list is empty

            remove()
            Retrieves and removes the first element of this list.
            Returns:the first element of this list
            Throws:NoSuchElementException – if this list is empty

            As a result; removeFirst() and pop() and remove() do the same

            poll()
            Retrieves and removes the head (first element) of this list.
            Returns:the head of this list, or null if this list is empty

            peek()
            Retrieves, but does not remove, the head (first element) of this list.
            Returns:the head of this list, or null if this list is empty

            element()
            Retrieves, but does not remove, the head (first element) of this list.
            Returns:the head of this list
            Throws:NoSuchElementException – if this list is empty
         */
        //Retrieves, but does not remove, the first element of this list.
        //copy+paste

        //Retrieves, but does not remove, the first element of this list.
        //copy+paste
        r.element();

        //Retrieves and removes the first element of this list.
        //cut+paste
        r.poll();

        //Retrieves, but does not remove, the head (first element) of this list.
        //copy+paste
        r.peek();


    }

}
