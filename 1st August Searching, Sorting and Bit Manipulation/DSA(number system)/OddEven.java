public class OddEven {
    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 3;

        System.out.println(num1 + ", " + (isOdd(num1) ? "Odd" : "Even"));
        System.out.println(num2 + ", " + (isOdd(num2) ? "Odd" : "Even"));
    }
}
