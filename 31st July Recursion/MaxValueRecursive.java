public class MaxValueRecursive {

    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index]; // Base case: if it's the last element, return the element itself
        } else {
            int maxInRest = findMax(arr, index + 1); // Recursively find the maximum value in the rest of the array
            return Math.max(arr[index], maxInRest); // Compare the current element with the maximum in the rest
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 1, -3, 22, 5};
        int max = findMax(arr, 0);
        System.out.println("Max value in the array: " + max); // Output: Max value in the array: 22
    }
}
