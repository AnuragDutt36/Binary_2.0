class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result1 = calc.add(2, 3);          // Calls add(int a, int b)
        double result2 = calc.add(2.5, 3.7);   // Calls add(double a, double b)
    }
}
