import java.util.Arrays;

public class SelectionSortDescendingIterations {
    public static int selectionSortIterations(int[] arr) {
        int n = arr.length;
        int iterations = 0;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                iterations++;
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return iterations;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 0};
        System.out.println("Input Array: " + Arrays.toString(arr));

        int iterations = selectionSortIterations(arr);
        System.out.println("Number of Iterations in Selection Sort: " + iterations);
    }
}
