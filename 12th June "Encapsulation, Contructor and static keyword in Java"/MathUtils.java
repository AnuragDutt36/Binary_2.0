public class MathUtils {
    public static final double PI = 3.14159;

    public static int add(int a, int b) {
        return a + b;
    }

    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        int sum = MathUtils.add(5, 3);
        System.out.println("Sum: " + sum);

        double area = MathUtils.calculateCircleArea(2.5);
        System.out.println("Circle Area: " + area);
    }
}
