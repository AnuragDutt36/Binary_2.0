public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr1 = {34, 21, 54, 65, 43};
        int[] arr2 = {4, 3, 6, 7, 1};

        int secondLargest1 = findSecondLargest(arr1);
        int secondLargest2 = findSecondLargest(arr2);

        System.out.println("Output 1: " + secondLargest1);
        System.out.println("Output 2: " + secondLargest2);
    }

    // Time complexity : O(n)
    // Space complexity : O(1)
    
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
