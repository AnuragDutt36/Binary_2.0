public class MaxValueInArray {
    public static void main(String[] args) {
        int[] array = {13, 1, -3, 22, 5};
        int maxValue = findMaxValue(array);
        
        if (maxValue != Integer.MIN_VALUE) {
            System.out.println("The maximum value in the array is: " + maxValue);
        } else {
            System.out.println("The array is empty");
        }
    }

    public static int findMaxValue(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE; // Return a special value for an empty array
        }

        int maxValue = arr[0]; // Initialize with the first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        return maxValue;
    }
}

