//package cse303java.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1{
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<String>();
        t.add("D");
        t.add("B");
        t.add("C");
        t.add("E");
        t.add("A");
        System.out.println("TreeSet: " + t);

        System.out.println("Initial set: " + t);
        System.out.println("Reverse set" + t.descendingSet());
        System.out.println("headSet: " + t.headSet("C"));
        System.out.println("tailSet: " + t.tailSet("C"));
        System.out.println("subSet: " + t.subSet("B", "D"));
        Iterator<String> it = t.iterator();
        System.out.print("Iterating through the set: ");
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        Iterator<String> i = t.descendingIterator();
        System.out.print("Iterating through the set in reverse order: ");
        while(i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();
        System.out.println("Lowest value: "+t.pollFirst());
        System.out.println("Highest value: "+t.pollLast());
        System.out.println("TreeSet after removing lowest and highest: " + t);
    }
}

/*
 * TreeSet: [A, B, C, D, E]
Initial set: [A, B, C, D, E]
Reverse set[E, D, C, B, A]
headSet: [A, B]
tailSet: [C, D, E]
subSet: [B, C]
Iterating through the set: A B C D E 
Iterating through the set in reverse order: E D C B A 
Lowest value: A
Highest value: E
TreeSet after removing lowest and highest: [B, C, D]
 */