import java.util.*;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println("Output: " + canConstruct("a", "b")); // Output: false
        System.out.println("Output: " + canConstruct("aa", "ab")); // Output: false
        System.out.println("Output: " + canConstruct("aa", "aab")); // Output: true
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            magazineMap.put(ch, magazineMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(ch) || magazineMap.get(ch) <= 0) {
                return false;
            }
            magazineMap.put(ch, magazineMap.get(ch) - 1);
        }
        return true;
    }
}
