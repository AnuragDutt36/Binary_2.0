public class ArmstrongNumber {
    public static void main(String[] args) {
        int n1 = 153;
        System.out.println(n1 + " is an Armstrong number: " + isArmstrong(n1));

        int n2 = 134;
        System.out.println(n2 + " is an Armstrong number: " + isArmstrong(n2));
    }

    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int numDigits = countDigits(n);
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n /= 10;
        }

        return sum == originalNumber;
    }

    public static int countDigits(int num) {
        int count = 0;

        while (num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}
