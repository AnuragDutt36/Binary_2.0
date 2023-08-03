import java.util.*;

public class BubbleSortDescending {
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // Change to > for descending order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                // If no elements were swapped in the inner loop, the array is already sorted.
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 0};

        bubbleSortDescending(arr);

        System.out.print("Output Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
