public class FirstPeakElement {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 6, 5};
        int[] arr2 = {1, 4, 7, 3, 2, 6, 5};

        int peak1 = findFirstPeakElement(arr1);
        int peak2 = findFirstPeakElement(arr2);

        System.out.println("Output 1: " + peak1);
        System.out.println("Output 2: " + peak2);
    }

    // Time complexity : O(n)
    // Space complexity : O(1)
    
    public static int findFirstPeakElement(int[] arr) {
        if (arr.length < 3) {
            return -1; // No peak element if the array has less than 3 elements
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return arr[i]; // Found a peak element
            }
        }

        // Check if the first element is a peak
        if (arr[0] > arr[1]) {
            return arr[0];
        }

        // Check if the last element is a peak
        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            return arr[arr.length - 1];
        }

        return -1; // No peak element found
    }
}
