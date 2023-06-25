import java.util.Scanner;

public class StringInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");

        // Read the user input as a string
        String userInput = scanner.nextLine();

        System.out.println("You entered: " + userInput);

        // Close the scanner
        scanner.close();
    }
}
