import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 4, 1};
        
        System.out.println(containsDuplicate(nums1)); // Output: No
        System.out.println(containsDuplicate(nums2)); // Output: Yes
    }
    
    public static String containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return "Yes";
            }
            set.add(num);
        }
        return "No";
    }
}
