public class SumOfDigitsRecursive {

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n; // Base case: if n is a single digit, return n
        } else {
            int lastDigit = n % 10; // Get the last digit
            int remainingNumber = n / 10; // Remove the last digit from the number
            return lastDigit + sumOfDigits(remainingNumber); // Recursively sum the digits of the remaining number
        }
    }

    public static void main(String[] args) {
        int n = 1234;
        int sum = sumOfDigits(n);
        System.out.println("Sum of digits of " + n + " is: " + sum); // Output: Sum of digits of 1234 is: 10
    }
}
