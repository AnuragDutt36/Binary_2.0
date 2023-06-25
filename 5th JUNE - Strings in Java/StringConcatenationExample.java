public class StringConcatenationExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Method 1: Using the concatenation operator '+'
        String result1 = str1 + " " + str2;
        System.out.println("Concatenated string using '+' operator: " + result1);

        // Method 2: Using the concat() method
        String result2 = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string using concat() method: " + result2);
    }
}
