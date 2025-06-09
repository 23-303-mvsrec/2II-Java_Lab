//package cse303java.Collections;

import java.util.ArrayList;

public class IteratorVsListIteratorExample {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        // Using Iterator to traverse the list
        System.out.println("Using Iterator:");
        java.util.Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
        // Using ListIterator to traverse the list
        System.out.println("\nUsing ListIterator:");
        java.util.ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }
        // Using ListIterator to traverse the list in reverse order
        System.out.println("\nUsing ListIterator in reverse order:");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }
    }
    
}
