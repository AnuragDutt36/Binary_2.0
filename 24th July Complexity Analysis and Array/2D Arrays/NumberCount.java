import java.util.Scanner;

public class NumberCount {
    // Time Complexity: O(m * n);
    // Space Complexity: O(1);
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        System.out.println("Enter the " + (m * n) + " integer inputs:");

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int num = arr[i][j];
                if (num > 0) {
                    positiveCount++;
                }

                if (num < 0) {
                    negativeCount++;
                }

                if (num % 2 == 0) {
                    evenCount++;
                }

                if (num % 2 != 0) {
                    oddCount++;
                }

                if (num == 0) {
                    zeroCount++;
                }
            }
        }

        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of zeros: " + zeroCount);
    }
}
