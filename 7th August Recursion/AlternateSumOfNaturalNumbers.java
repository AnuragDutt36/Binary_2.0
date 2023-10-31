public class AlternateSumOfNaturalNumbers {
    public static void main(String[] args) {
        int n1 = 10;
        int sum1 = alternateSum(n1, 1);
        System.out.println("Alternate sum up to " + n1 + " is: " + sum1);

        int n2 = 5;
        int sum2 = alternateSum(n2, 1);
        System.out.println("Alternate sum up to " + n2 + " is: " + sum2);
    }

    public static int alternateSum(int n, int i) {
        if (i == n + 1) {
            return 0;
        }
        if (i % 2 != 0) {
            return alternateSum(n, i + 1) + i;
        } else {
            return alternateSum(n, i + 1) - i;
        }
    }
}
