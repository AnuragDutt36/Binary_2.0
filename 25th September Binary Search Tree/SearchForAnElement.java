
public class SearchForAnElement {
    public static class TreeNode {
        TreeNode root;
        TreeNode left, right;
        int val;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode insertingBSTElements(TreeNode root, int num) {
        if (root == null) {
            return new TreeNode(num);
        }

        if (num < root.val) {
            // traverse towards the left subtree
            root.left = insertingBSTElements(root.left, num);
        } else {
            // traverse towards the right subtree
            root.right = insertingBSTElements(root.right, num);
        }
        return root;
    }

    public static boolean searchingBST(TreeNode root, int num) {
        if (root == null) {
            return false; // Empty tree or element not found
        }

        if (root.val == num) {
            return true; // Element found in the current node
        } else if (num < root.val) {
            return searchingBST(root.left, num); // Search in the left subtree
        } else {
            return searchingBST(root.right, num); // Search in the right subtree
        }
    }

    public static void main(String args[]) {
        int[] arr = { 15, 10, 20, 8, 12, 16, 25 };

        TreeNode root = null;
        for (int i : arr) {
            root = insertingBSTElements(root, i);
        }

        int searchFor = 25;
        boolean res = searchingBST(root, searchFor);

        System.out.println("Output: " + res);
    }

}