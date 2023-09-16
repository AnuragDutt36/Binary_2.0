import java.util.*;

public class DiagonalElements {
    // Time complexity: O(n * m);
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

        Set<Integer> diagonals = new HashSet<>();

        for (int i = 0; i < size; i++) {
            diagonals.add(matrix[i][i]);
            diagonals.add(matrix[i][size - i - 1]);
        }

        System.out.print("Elements of both diagonals in ascending order: ");
        for (int num : diagonals) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
