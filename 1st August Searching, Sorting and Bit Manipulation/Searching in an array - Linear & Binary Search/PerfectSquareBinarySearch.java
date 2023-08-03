import java.util.*;

public class PerfectSquareBinarySearch {
    public static boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        long low = 2;
        long high = num / 2;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 14;

        System.out.println("Output 1: " + isPerfectSquare(num1));
        System.out.println("Output 2: " + isPerfectSquare(num2));
    }
}
