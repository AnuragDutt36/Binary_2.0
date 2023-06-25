public class Question1 {

    // Method with one parameter of type int
    public static void printNumber(int number) {
        System.out.println("Number: " + number);
    }

    // Method with one parameter of type double
    public static void printNumber(double number) {
        System.out.println("Number: " + number);
    }

    // Method with two parameters of type int
    public static void printSum(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
    }

    // Method with two parameters of type double
    public static void printSum(double num1, double num2) {
        System.out.println("Sum: " + (num1 + num2));
    }

    public static void main(String args[]) {
        // Calling the methods with different parameters
        printNumber(10);
        printNumber(3.14);
        printSum(5, 89);
        printSum(2.4, 6.7);
    }
}