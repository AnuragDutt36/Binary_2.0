import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 1, 9};
        System.out.println(findMajorityElement(nums)); // Output: 9
    }
    
    public static int findMajorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int majorityThreshold = nums.length / 2;
        
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > majorityThreshold) {
                return num;
            }
        }
        
        return -1; // Majority element not found
    }
}
