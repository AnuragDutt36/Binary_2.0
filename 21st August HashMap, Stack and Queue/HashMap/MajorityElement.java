import java.util.*;

public class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int num : nums) {
            map.put(num, 1);
        }

        return map.lastKey();

    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 7, 1, 9 };
        System.out.println("Output: " + findMajorityElement(nums)); // Output: 9
    }

}
