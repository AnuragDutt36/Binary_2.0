import java.util.*;

public class Permutations {
    public static void backtrack(List<List<Integer>> result, List<Integer> perm, int[] arr) {
        if (perm.size() == arr.length) {
            result.add(new ArrayList<>(perm));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (perm.contains(arr[i])) {
                System.out.println(arr[i]);
                continue;
            }
            perm.add(arr[i]);
            backtrack(result, perm, arr);
            perm.remove(perm.size() - 1);
        }
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     

    public static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), arr);
        return result;
    }

    public static void main(String args[]) {
        int[] num = { 1, 2, 3 };
        System.out.println(permute(num));
    }
}
