public class EqualSumSubsets {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 2 };
        int k = 2;
        System.out.println(canPartitionKSubsets(arr, k));
    }

    public static boolean canPartitionKSubsets(int[] arr, int k) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        if (totalSum % k != 0) {
            return false; // If total sum is not divisible by k, it's not possible to form equal sum
                          // subsets
        }

        int targetSum = totalSum / k;
        boolean[] visited = new boolean[arr.length];

        return backtrack(arr, visited, 0, k, 0, targetSum);
    }

    public static boolean backtrack(int[] arr, boolean[] visited, int startIndex, int k, int currentSum,
            int targetSum) {
        if (k == 0) {
            return true; // All subsets have been formed
        }

        if (currentSum == targetSum) {
            return backtrack(arr, visited, 0, k - 1, 0, targetSum);
        }

        for (int i = startIndex; i < arr.length; i++) {
            if (!visited[i] && currentSum + arr[i] <= targetSum) {
                visited[i] = true;
                if (backtrack(arr, visited, i + 1, k, currentSum + arr[i], targetSum)) {
                    return true;
                }
                visited[i] = false;
            }
        }

        return false;
    }
}
