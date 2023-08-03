public class BinaryRepresentation {
    public static String binaryRepresentation(int number) {
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            int bit = number % 2;
            binary.insert(0, bit);
            number /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;

        System.out.println("Output 1: " + binaryRepresentation(number1));
        System.out.println("Output 2: " + binaryRepresentation(number2));
    }
}
