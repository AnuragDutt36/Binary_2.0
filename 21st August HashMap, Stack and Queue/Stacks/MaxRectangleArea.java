import java.util.*;

public class MaxRectangleArea {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int[] left = new int[cols];
        int[] right = new int[cols];
        Arrays.fill(right, cols);
        
        int maxArea = 0;
        
        for (int i = 0; i < rows; i++) {
            int curLeft = 0, curRight = cols;
            
            // Calculate heights
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            
            // Calculate left boundary
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    left[j] = Math.max(left[j], curLeft);
                } else {
                    left[j] = 0;
                    curLeft = j + 1;
                }
            }
            
            // Calculate right boundary
            for (int j = cols - 1; j >= 0; j--) {
                if (matrix[i][j] == '1') {
                    right[j] = Math.min(right[j], curRight);
                } else {
                    right[j] = cols;
                    curRight = j;
                }
            }
            
            // Calculate maximum area for current row
            for (int j = 0; j < cols; j++) {
                maxArea = Math.max(maxArea, (right[j] - left[j]) * heights[j]);
            }
        }
        
        return maxArea;
    }

    public static void main(String[] args) {
        MaxRectangleArea solution = new MaxRectangleArea();

        char[][] matrix1 = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };
        System.out.println(solution.maximalRectangle(matrix1)); // Output: 6
        
        char[][] matrix2 = {
            {'0'}
        };
        System.out.println(solution.maximalRectangle(matrix2)); // Output: 0
        
        char[][] matrix3 = {
            {'1'}
        };
        System.out.println(solution.maximalRectangle(matrix3)); // Output: 1
    }
}
