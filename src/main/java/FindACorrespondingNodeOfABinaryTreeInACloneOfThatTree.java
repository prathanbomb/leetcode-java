import java.util.ArrayDeque;
import java.util.Queue;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(cloned);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.val == target.val)
                return node;
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        return cloned;
    }
}
