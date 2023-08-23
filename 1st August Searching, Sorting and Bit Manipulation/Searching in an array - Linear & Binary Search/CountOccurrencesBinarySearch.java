import java.util.*;

public class CountOccurrencesBinarySearch {
    public static int countOccurrences(int[] arr, int target) {
        int firstOccurrence = findFirstOccurrence(arr, target);
        if (firstOccurrence == -1) {
            return 0;
        }

        int lastOccurrence = findLastOccurrence(arr, target);
        System.out.println(lastOccurrence + " " + firstOccurrence);
        return lastOccurrence - firstOccurrence + 1;
    }

    public static int findFirstOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static int findLastOccurrence(int[] arr, int target) {
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
        int[] arr = { 2, 5, 5, 5, 6, 6, 8, 9, 9, 9 };
        int target1 = 5;
        int target2 = 6;
        int count1 = countOccurrences(arr, target1);
        int count2 = countOccurrences(arr, target2);
        System.out.println("Output 1: Target " + target1 + " occurs " + count1 + " times");
        System.out.println("Output 2: Target " + target2 + " occurs " + count2 + " times");
    }
}
