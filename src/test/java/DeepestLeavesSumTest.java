import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeepestLeavesSumTest {
    @Test
    void testcase1() {
        DeepestLeavesSum.TreeNode node8 = new DeepestLeavesSum.TreeNode(8, null, null);
        DeepestLeavesSum.TreeNode node7 = new DeepestLeavesSum.TreeNode(7, null, null);
        DeepestLeavesSum.TreeNode node6 = new DeepestLeavesSum.TreeNode(6, null, node8);
        DeepestLeavesSum.TreeNode node5 = new DeepestLeavesSum.TreeNode(5, null, null);
        DeepestLeavesSum.TreeNode node4 = new DeepestLeavesSum.TreeNode(4, node7, null);
        DeepestLeavesSum.TreeNode node3 = new DeepestLeavesSum.TreeNode(3, null, node6);
        DeepestLeavesSum.TreeNode node2 = new DeepestLeavesSum.TreeNode(2, node4, node5);
        DeepestLeavesSum.TreeNode node1 = new DeepestLeavesSum.TreeNode(1, node2, node3);
        assertEquals(15, DeepestLeavesSum.deepestLeavesSum(node1));
    }
}
