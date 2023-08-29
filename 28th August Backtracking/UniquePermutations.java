import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniquePermutations {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        List<List<Integer>> result1 = findUniquePermutations(nums1);
        System.out.println(result1);

        int[] nums2 = {1, 2, 3};
        List<List<Integer>> result2 = findUniquePermutations(nums2);
        System.out.println(result2);
    }

    public static List<List<Integer>> findUniquePermutations(int[] nums) {
        Arrays.sort(nums); // Sort the input array to handle duplicates
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new boolean[nums.length], new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue; // Skip duplicates or already used numbers
            }

            used[i] = true;
            current.add(nums[i]);
            backtrack(nums, used, current, result);
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
}
