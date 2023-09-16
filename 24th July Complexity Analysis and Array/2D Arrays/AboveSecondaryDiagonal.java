import java.util.Scanner;

public class AboveSecondaryDiagonal {
    // Time complexity : O(n^2);
    // Space complexity : O(1);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        System.out.println("Enter the elements of the square matrix:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Elements above the secondary diagonal: ");

        for (int i = 0; i < size - 1; i++) {
            int aboveSecond = size - (i + 1);
            for (int j = 0; j < aboveSecond; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
}
