import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> permutations = findPermutations(arr);
        
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }

    public static List<List<Integer>> findPermutations(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(int[] arr, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int num : arr) {
            if (!current.contains(num)) {
                current.add(num);
                backtrack(arr, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}
