public class ArraySumRecursive {

    public static int arraySum(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index]; // Base case: if it's the last element, return the element itself
        } else {
            return arr[index] + arraySum(arr, index + 1); // Recursively add the current element with the sum of the rest
        }
    }

    public static void main(String[] args) {
        int[] arr = {92, 23, 15, -20, 10};
        int sum = arraySum(arr, 0);
        System.out.println("Sum of the values in the array: " + sum); // Output: Sum of the values in the array: 120
    }
}
