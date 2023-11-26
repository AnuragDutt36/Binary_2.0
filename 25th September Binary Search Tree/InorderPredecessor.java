

public class InorderPredecessor {
    public static class TreeNode {
        TreeNode root;
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode insertIntoBST(TreeNode root, int num) {
        if (root == null) {
            return new TreeNode(num);
        }

        if (num < root.val) {
            root.left = insertIntoBST(root.left, num);
        } else {
            root.right = insertIntoBST(root.right, num);
        }
        return root;
    }

    public static TreeNode findMaximum(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    public static TreeNode findPredecessor(TreeNode root, TreeNode prec, int node) {
        if (node == root.val) {
            if (root.left != null) {
                return findMaximum(root.left);
            }
        } else if (node < root.val) {
            return findPredecessor(root.left, prec, node);
        }
        else {
            prec = root;
            return findPredecessor(root.right, prec, node);
        }
        return prec;
    }

    public static void main(String args[]) {
        int[] nodes = { 15, 10, 20, 8, 12, 16, 25 };

        TreeNode root = null;
        for (int i : nodes) {
            root = insertIntoBST(root, i);
        }

        for (int j : nodes) {
            TreeNode prec = findPredecessor(root, null, j);

            if (prec != null) {
                System.out.println("The predecessor of node " + j + " is " + prec.val);
            } else {
                System.out.println("The predecessor doesn't exist for node "
                        + j);
            }
        }
    }
}
