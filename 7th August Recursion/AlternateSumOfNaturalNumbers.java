public class AlternateSumOfNaturalNumbers {
    public static void main(String[] args) {
        int n1 = 10;
        int sum1 = alternateSum(n1);
        System.out.println("Alternate sum up to " + n1 + " is: " + sum1);

        int n2 = 5;
        int sum2 = alternateSum(n2);
        System.out.println("Alternate sum up to " + n2 + " is: " + sum2);
    }

    public static int alternateSum(int n) {
        if (n % 2 == 0) {
            return n / 2 * (1 - n); // Sum formula for even numbers
        } else {
            return (n + 1) / 2 - n / 2; // Sum formula for odd numbers
        }
    }
}
