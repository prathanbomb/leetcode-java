public class DeepestLeavesSum {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int deepestLeavesSum(TreeNode root) {
        return sum(root, 0, 1, findMaxDept(root, 1));
    }

    public static int findMaxDept(TreeNode node, int dept) {
        if (node.left == null && node.right == null)
            return dept;
        int left = 0;
        int right = 0;
        if (node.left != null)
            left = findMaxDept(node.left, dept + 1);
        if (node.right != null)
            right = findMaxDept(node.right, dept + 1);
        return Math.max(left, right);
    }

    public static int sum(TreeNode node, int curSum, int dept, int maxDept) {
        if (node.left == null && node.right == null && dept == maxDept)
            return node.val + curSum;
        int left = 0;
        int right = 0;
        if (node.left != null)
            left = sum(node.left, curSum, dept + 1, maxDept);
        if (node.right != null)
            right = sum(node.right, curSum, dept + 1, maxDept);
        return left + right;
    }

}
