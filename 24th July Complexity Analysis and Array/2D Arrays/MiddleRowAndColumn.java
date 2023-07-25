public class MiddleRowAndColumn {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4, 5},
            {3, 4, 5, 6, 7},
            {7, 6, 5, 4, 3},
            {8, 7, 6, 5, 4},
            {1, 2, 37, 8, 0}
        };

        int size = array.length;

        displayMiddleRowAndColumn(array, size);
    }

    public static void displayMiddleRowAndColumn(int[][] array, int size) {
        int middleRow = size / 2;
        int middleColumn = size / 2;
        if (size % 2 == 0) {
            middleRow--;
            middleColumn--;
        }

        System.out.print("Output in the same line with repetition: ");
        
        // Print middle row elements (except the center element)
        for (int i = 0; i < size; i++) {
            if (i != middleColumn) {
                System.out.print(array[middleRow][i] + " ");
            }
        }

        // Print middle column elements
        for (int i = 0; i < size; i++) {
            System.out.print(array[i][middleColumn] + " ");
        }

        // Print the center element
        System.out.print(array[middleRow][middleColumn] + " ");
        
        System.out.println();
    }
}
