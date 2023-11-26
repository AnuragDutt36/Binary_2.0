public class LowestCommonAncestor {
    static class TreeNode {
        TreeNode root;
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    private static TreeNode insertIntoBST(TreeNode root, int num) {
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

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        int parentVal = root.val;
        int pVal = p.val;
        int qVal = q.val;

        if (pVal > parentVal && qVal > parentVal) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (pVal < parentVal && qVal < parentVal) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 15, 10, 20, 8, 12, 16, 25 };

        TreeNode root = null;
        for (int i : nodes) {
            root = insertIntoBST(root, i);
        }

        TreeNode res1 = lowestCommonAncestor(root, new TreeNode(8), new TreeNode(12));
        TreeNode res2 = lowestCommonAncestor(root, new TreeNode(10), new TreeNode(12));
        TreeNode res3 = lowestCommonAncestor(root, new TreeNode(25), new TreeNode(8));
        TreeNode res4 = lowestCommonAncestor(root, new TreeNode(16), new TreeNode(12));
        TreeNode res5 = lowestCommonAncestor(root, new TreeNode(25), new TreeNode(25));

        System.out.println("LCA (8, 12) = " + res1.val);
        System.out.println("LCA (10, 12) = " + res2.val);
        System.out.println("LCA (25, 8) = " + res3.val);
        System.out.println("LCA (16, 12) = " + res4.val);
        System.out.println("LCA (25, 25) = " + res5.val);
    }
}
