public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        int n = 1234;
        int sum = sumOfDigits(n);
        System.out.println("Sum of digits of " + n + " is: " + sum);
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0; // Base case: sum of digits of 0 is 0
        } else {
            return n % 10 + sumOfDigits(n / 10); // Add last digit to sum of remaining digits
        }
    }
}
