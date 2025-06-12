import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("a");
        al.add("aa");
        al.add("aaa");
        al.add("aaaa");
        al.add("aaaaa");
        System.out.println(al);

        System.out.println("ArrayList using ListIterator(2)");
        ListIterator<String> listIterator = al.listIterator(2);
	//Ascending order
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
	//Descending Order
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        al.add(2, "b");
        System.err.println("After adding 'b' in 2nd index: "+ al);

        al.remove(3);
        System.out.println("After removing element at 3rd index: " + al);

        al.set(2, "c");
        System.out.println("After setting 'c' at 2nd index: " + al);
    }
}
