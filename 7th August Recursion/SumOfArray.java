public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {92, 23, 15, -20, 10};
        int sum = findSum(array);
        System.out.println("The sum of the values in the array is: " + sum);
    }

    public static int findSum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }
}
