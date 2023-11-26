import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question3 {
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
            root.left = insertingBSTElements(root.left, num);
        } else {
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

    public static boolean findingPair(TreeNode root, int sum, Set<Integer> set) {
        ArrayList<Integer> result = inOrderTraversal(root, new ArrayList<>());
        for (int i = 0; i < result.size(); i++) {
            if (result.contains(sum - result.get(i))) {
                System.out.println("Pair found : (" + result.get(i) + ", " + (sum - result.get(i)) + ")");
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int[] nodes = { 15, 10, 20, 8, 12, 20, 30, 6, 9, 18, 22 };

        TreeNode root = null;
        for (int i : nodes) {
            root = insertingBSTElements(root, i);
        }

        int sum = 10;
        Set<Integer> set = new HashSet<>();

        if (!findingPair(root, sum, set)) {
            System.out.println("Pair does not exist.");
        }
    }
}
