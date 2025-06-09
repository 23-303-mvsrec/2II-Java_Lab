package cse303java.Collections;

import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Java");
        al.add("Python");
        al.add("C++");
        al.add(303);
        al.add(3.14);
        System.out.println("ArrayList elements: " + al);
    	for (Object subjects : al) {
        	System.out.println(subjects);
    	}

        al.add(2,"JavaScript");
        System.out.println("After adding JavaScript at index 2: " + al);
        al.remove(3); // removes the element at index 3
        System.out.println("After removing element at index 3: " + al);
        al.set(1, "C#"); // replaces the element at index 1
        System.out.print("Iterating through the ArrayList using for-each loop: ");
        for (Object item : al) {
            System.out.println(item+ " ");
        }
    }
}
