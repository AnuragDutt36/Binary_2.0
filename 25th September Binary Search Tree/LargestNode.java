import java.util.ArrayList;

public class LargestNode {
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

    public static ArrayList<Integer> inOrderTraversal(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return result;
        }
        inOrderTraversal(root.left, result);
        result.add(root.val);
        inOrderTraversal(root.right, result);

        return result;
    }

    public static int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> result = inOrderTraversal(root, new ArrayList<>());
        return result.get(result.size() - k);
    }

    public static void main(String args[]) {
        int[] node = { 15, 10, 20, 8, 12, 16, 25 };

        TreeNode root = null;
        for (int i : node) {
            root = insertingBSTElements(root, i);
        }

        int kth = 2;

        int ans = kthSmallest(root, kth);
        System.out.println("Output: " + ans);
    }
}
