import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<String> subjects = new PriorityQueue<String>();
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("C++");
        subjects.add("JavaScript");

        System.out.println("head: " + subjects.element());
        System.out.println("head: " + subjects.peek());
        System.out.println("Iterating over elements:");
        Iterator<String> itr = subjects.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        subjects.remove("C++");
        System.out.println("After removing C++: " + subjects);
        subjects.poll();
        System.out.println("After polling: " + subjects);
        Iterator<String> itr2 = subjects.iterator();
        while (itr.hasNext()) {
            System.out.print(itr2.next() + " ");
        }

    }
}
