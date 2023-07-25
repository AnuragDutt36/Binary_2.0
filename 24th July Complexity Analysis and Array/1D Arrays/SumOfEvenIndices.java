public class SumOfEvenIndices {
    public static void main(String[] args) {
        int[] arr1 = {3, 20, 4, 6, 9};
        int[] arr2 = {4, 3, 6, 7, 1};

        int sum1 = calculateSumOfEvenIndices(arr1);
        int sum2 = calculateSumOfEvenIndices(arr2);

        System.out.println("Output 1: " + sum1);
        System.out.println("Output 2: " + sum2);
    }

    public static int calculateSumOfEvenIndices(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }
}
