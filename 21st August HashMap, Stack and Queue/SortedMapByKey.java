import java.util.*;

public class SortedMapByKey {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(5, "Rahul");
        map.put(7, "Lakshman");
        map.put(1, "Ram");
        map.put(4, "Krrish");
        map.put(2, "Lakshay");
        
        System.out.println(map);
    }
}
