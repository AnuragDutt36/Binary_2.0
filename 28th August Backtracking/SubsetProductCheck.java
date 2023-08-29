public class SubsetProductCheck {

    public static void main(String[] args) {
        int[] array = {2, 3, 2, 5, 4};
        int target = 16;
        boolean result = isSubsetProductEqual(array, target);
        
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isSubsetProductEqual(int[] array, int target) {
        return backtrack(array, 0, 1, target);
    }

    public static boolean backtrack(int[] array, int index, int currentProduct, int target) {
        if (currentProduct == target) {
            return true;
        }

        if (index >= array.length || currentProduct > target) {
            return false;
        }

        // Include the current element in the product
        if (backtrack(array, index + 1, currentProduct * array[index], target)) {
            return true;
        }

        // Exclude the current element from the product
        if (backtrack(array, index + 1, currentProduct, target)) {
            return true;
        }

        return false;
    }
}
