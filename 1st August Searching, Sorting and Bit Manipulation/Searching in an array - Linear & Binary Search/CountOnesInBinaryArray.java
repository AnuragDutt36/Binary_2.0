import java.util.*;

public class CountOnesInBinaryArray {
    public static int countOnes(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 0) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] == 0) {
                    return arr.length - mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        int result1 = countOnes(arr1);
        System.out.println("Output 1: " + result1);

        int[] arr2 = {0, 0, 0, 0, 0, 1, 1};
        int result2 = countOnes(arr2);
        System.out.println("Output 2: " + result2);
    }
}
