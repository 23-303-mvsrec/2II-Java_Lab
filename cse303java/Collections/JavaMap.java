// import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMap {
    public static void main(String[] args) {
        //HashMap<String,Integer> map = new HashMap<String,Integer>();
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Ch", 91);
        map.put("B", 22);
        map.put("C", 3);
        map.put("D", 4);
        
        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("map.get(\"B\") = " + map.get("B"));
        System.out.println("map.containsKey(\"C\") = " + map.containsKey("C"));
        System.out.println("map.containsValue(3) = " + map.containsValue(3));
        System.out.println("map.remove(\"D\") = " + map.remove("D"));
        System.out.println("descendingMap: " + map.descendingMap());
        //returns key-value pairs whose keys are less than or equal to the specified key
        System.out.println("headMap(\"C\") = " + map.headMap("C"));
        //returns key-value pairs whose keys are greater than or equal to the specified key
        System.out.println("tailMap(\"B\") = " + map.tailMap("B"));
        //returns key-value pairs whose keys are greater than or equal to the specified key and less than the specified key
        System.out.println("subMap(\"A\", \"C\") = " + map.subMap("A", "C"));
    }
}
