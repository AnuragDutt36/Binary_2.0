public class MaximumElement {
    public static void main(String[] args) {
        int[] arr1 = {34, 21, 54, 65, 43};
        int[] arr2 = {4, 3, 6, 7, 1};

        int max1 = findMaximumElement(arr1);
        int max2 = findMaximumElement(arr2);

        System.out.println("Output 1: " + max1);
        System.out.println("Output 2: " + max2);
    }

    public static int findMaximumElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
