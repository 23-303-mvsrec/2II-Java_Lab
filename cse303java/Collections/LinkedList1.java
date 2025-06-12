import java.util.*;

class LinkedList1{
	public static void main(String... args){
		LinkedList<String> names = new LinkedList<String>();
		names.add("Vaishnavi");
		names.add("Vamshidhar");
		names.add("Akshay");
		names.add("Sairam");

		Iterator<String> itr = names.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");

		System.out.println();
		System.out.println("names: "+names);
		names.addFirst("Abhinav");
		names.addLast("Chandrika");

		Iterator<String> itr2 = names.iterator();
		while(itr2.hasNext())
                        System.out.print(itr2.next()+" ");
		System.out.println();
		System.out.println("names after adding first and last: "+names);

		System.out.println("names.getFirst(): "+names.getFirst());
		System.out.println("names.getLast(): "+names.getLast());
		System.out.println("names.element(): "+names.element());
		System.out.println("names.get(2): "+names.get(2));
		System.out.println("names.size(): "+names.size());
		System.out.println("names.isEmpty(): "+names.isEmpty());
		System.out.println("names.contains(\"Akshay\"): "+names.contains("Akshay"));
		System.out.println("names.indexOf(\"Akshay\"): "+names.indexOf("Akshay"));
		System.out.println("names.lastIndexOf(\"Akshay\"): "+names.lastIndexOf("Akshay"));
		System.out.println("names.removeFirst(): "+names.removeFirst());
		System.out.println("names.removeLast(): "+names.removeLast());
		System.out.println("names.remove(2): "+names.remove(2));
		System.out.println("names after removals: "+names);
		System.out.println("names.clear(): ");
		names.clear();
		System.out.println("names after clear: "+names);		
	}
}
