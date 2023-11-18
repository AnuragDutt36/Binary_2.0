import java.util.*;

public class UniquePermutations {
    // Function to generate unique permutations
    public static void backtrack(List<List<Integer>> result, List<Integer> perm, int[] arr, boolean[] used) {
        // If the current permutation's length equals the array length, add it to the
        // result or skip identical elements
        if (perm.size() == arr.length && !result.contains(perm)) {
            result.add(new ArrayList<>(perm));
            return;
        }

        // Loop through the array elements to generate permutations
        for (int i = 0; i < arr.length; i++) {
            // Skip used elements or
            if (used[i]) {
                continue;
            }
            // Mark the current element as used
            used[i] = true;
            // Add the current element to the permutation
            perm.add(arr[i]);
            // Recursively generate the next elements in the permutation
            backtrack(result, perm, arr, used);
            // Backtrack: remove the last element to explore other possibilities
            used[i] = false;
            perm.remove(perm.size() - 1);
        }
    }

    // Function to generate unique permutations for input array containing
    // duplicates
    public static List<List<Integer>> permuteUnique(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr); // Sort the array to handle duplicates
        boolean[] used = new boolean[arr.length];
        // Generate unique permutations using backtracking
        backtrack(result, new ArrayList<>(), arr, used);
        return result;
    }

    // Main method to test unique permutation generation
    public static void main(String args[]) {
        int[] num = { 1, 1, 2 };
        // Generate unique permutations for the input array
        List<List<Integer>> uniquePermutations = permuteUnique(num);
        // Print the unique permutations
        System.out.println(uniquePermutations);
    }
}
