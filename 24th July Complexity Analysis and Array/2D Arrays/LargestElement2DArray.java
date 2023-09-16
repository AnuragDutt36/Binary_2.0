import java.util.Scanner;

public class LargestElement2DArray {
    // Time complexity: O(n^2);
    // Space complexity : O(1);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Enter the elements of the 2D array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int largestElement = findLargestElement(array);

        System.out.println("The largest element in the 2D array is: " + largestElement);
    }

    public static int findLargestElement(int[][] array) {
        int maxElement = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }

        return maxElement;
    }
}
