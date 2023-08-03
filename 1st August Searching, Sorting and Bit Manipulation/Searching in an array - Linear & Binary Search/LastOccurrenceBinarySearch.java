import java.util.*;

public class LastOccurrenceBinarySearch {
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6};
        int target1 = 4;
        int result1 = lastOccurrence(arr1, target1);
        System.out.println("Output 1: " + result1);

        int[] arr2 = {2, 2, 2, 6, 6, 18, 29, 30, 30, 30};
        int target2 = 15;
        int result2 = lastOccurrence(arr2, target2);
        System.out.println("Output 2: " + result2);
    }
}
