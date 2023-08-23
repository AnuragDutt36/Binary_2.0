import java.util.*;

public class SortedMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Rahul", 5);
        map.put("Lakshman", 7);
        map.put("Ram", 1);
        map.put("Krrish", 4);
        map.put("Lakshay", 2);
        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        System.out.println(sortedMap);
    }
}
