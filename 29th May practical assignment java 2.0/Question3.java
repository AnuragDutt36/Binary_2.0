public class Question3 {
    public static void CalculateSum(int array[]) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        CalculateSum(new int[] { 2, 5, 9, 12, 20 }); // Anonymous Array
    }
}
