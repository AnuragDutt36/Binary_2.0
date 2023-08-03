import java.util.Arrays;

public class BubbleSortDescendingPasses {
    public static int bubbleSortPasses(int[] arr) {
        int n = arr.length;
        int passes = 0;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            passes++;
            if (!swapped) {
                break;
            }
        }
        return passes;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 6, 0 };
        System.out.println("Input Array: " + Arrays.toString(arr));

        int passes = bubbleSortPasses(arr);
        System.out.println("Number of Passes in Bubble Sort: " + passes);
    }
}
