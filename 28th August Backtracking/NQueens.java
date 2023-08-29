public class NQueens {

    public static void main(String[] args) {
        int n1 = 4;
        int solutions1 = totalNQueens(n1);
        System.out.println("Number of distinct solutions for n = " + n1 + ": " + solutions1);

        int n2 = 1;
        int solutions2 = totalNQueens(n2);
        System.out.println("Number of distinct solutions for n = " + n2 + ": " + solutions2);
    }

    public static int totalNQueens(int n) {
        int[] queens = new int[n]; // queens[i] represents the column position of the queen in row i
        return backtrack(queens, 0);
    }

    public static int backtrack(int[] queens, int row) {
        int n = queens.length;
        if (row == n) {
            return 1; // A valid placement of queens
        }

        int count = 0;
        for (int col = 0; col < n; col++) {
            if (isValidPlacement(queens, row, col)) {
                queens[row] = col;
                count += backtrack(queens, row + 1);
            }
        }
        return count;
    }

    public static boolean isValidPlacement(int[] queens, int row, int col) {
        for (int prevRow = 0; prevRow < row; prevRow++) {
            if (queens[prevRow] == col || Math.abs(queens[prevRow] - col) == row - prevRow) {
                return false;
            }
        }
        return true;
    }
}

