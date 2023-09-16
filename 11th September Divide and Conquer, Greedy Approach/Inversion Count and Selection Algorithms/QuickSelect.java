import java.util.Random;

// Time Complexity:
// Average Case: O(n)
// Worst Case: O(n^2)

// Space Complexity: O(1)

public class QuickSelect {

    public static int findKthLargest(int[] arr, int k) {
        if (k < 1 || k > arr.length)
            throw new IllegalArgumentException("Invalid k value");

        return quickSelect(arr, 0, arr.length - 1, k);
    }

    private static int quickSelect(int[] arr, int left, int right, int k) {
        if (left == right)
            return arr[left];

        int pivotIndex = partition(arr, left, right);

        if (k - 1 == pivotIndex)
            return arr[pivotIndex];
        else if (k - 1 < pivotIndex)
            return quickSelect(arr, left, pivotIndex - 1, k);
        else
            return quickSelect(arr, pivotIndex + 1, right, k);
    }

    private static int partition(int[] arr, int left, int right) {
        int pivotIndex = left + new Random().nextInt(right - left + 1);
        int pivotValue = arr[pivotIndex];
        swap(arr, pivotIndex, right);

        int i = left;
        for (int j = left; j < right; j++) {
            if (arr[j] >= pivotValue) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, right);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 2, 4, 5, 6, 7 };
        int k1 = 3;
        int result1 = findKthLargest(arr1, k1);
        System.out.println("Output 1: " + result1);

        int[] arr2 = { 4, 3, 3, 2, 1 };
        int k2 = 4;
        int result2 = findKthLargest(arr2, k2);
        System.out.println("Output 2: " + result2);
    }
}
