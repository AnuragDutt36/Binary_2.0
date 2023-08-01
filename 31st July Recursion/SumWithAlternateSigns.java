public class SumWithAlternateSigns {

    public static int sumWithAlternateSigns(int n) {
        if (n == 0) {
            return 0; // Base case: if n is 0, return 0
        } else {
            if (n % 2 == 0) {
                // If n is even, subtract the current number and make a recursive call with n-1
                return sumWithAlternateSigns(n - 1) - n;
            } else {
                // If n is odd, add the current number and make a recursive call with n-1
                return sumWithAlternateSigns(n - 1) + n;
            }
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int sum = sumWithAlternateSigns(n);
        System.out.println("Sum with alternate signs till " + n + " is: " + sum); // Output: Sum with alternate signs till 10 is: -5
    }
}
