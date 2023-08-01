public class ArmstrongNumberRecursive {

    public static int countDigits(int n) {
        if (n == 0) {
            return 0; // Base case: If the number is 0, return 0 (no digits)
        } else {
            return 1 + countDigits(n / 10); // Recursively count the digits by dividing the number by 10
        }
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1; // Base case: Any number raised to the power of 0 is 1
        } else {
            return base * power(base, exponent - 1); // Recursively calculate power by decreasing the exponent
        }
    }

    public static boolean isArmstrong(int n) {
        int totalDigits = countDigits(n);
        return n == calculateArmstrongSum(n, totalDigits);
    }

    public static int calculateArmstrongSum(int n, int totalDigits) {
        if (n == 0) {
            return 0; // Base case: If the number is 0, return 0 (sum of digits is 0)
        } else {
            int lastDigit = n % 10;
            return power(lastDigit, totalDigits) + calculateArmstrongSum(n / 10, totalDigits);
        }
    }

    public static void main(String[] args) {
        int num1 = 153;
        int num2 = 134;

        System.out.println(num1 + " is Armstrong? " + (isArmstrong(num1) ? "Yes" : "No")); // Output: 153 is Armstrong?
                                                                                           // Yes
        System.out.println(num2 + " is Armstrong? " + (isArmstrong(num2) ? "Yes" : "No")); // Output: 134 is Armstrong?
                                                                                           // No
    }
}
