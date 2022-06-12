import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeNodesInBetweenZerosTest {
    @Test
    void testcase1() {
        MergeNodesInBetweenZeros.ListNode listNode7 = new MergeNodesInBetweenZeros.ListNode(0, null);
        MergeNodesInBetweenZeros.ListNode listNode6 = new MergeNodesInBetweenZeros.ListNode(2, listNode7);
        MergeNodesInBetweenZeros.ListNode listNode5 = new MergeNodesInBetweenZeros.ListNode(5, listNode6);
        MergeNodesInBetweenZeros.ListNode listNode4 = new MergeNodesInBetweenZeros.ListNode(4, listNode5);
        MergeNodesInBetweenZeros.ListNode listNode3 = new MergeNodesInBetweenZeros.ListNode(0, listNode4);
        MergeNodesInBetweenZeros.ListNode listNode2 = new MergeNodesInBetweenZeros.ListNode(1, listNode3);
        MergeNodesInBetweenZeros.ListNode listNode1 = new MergeNodesInBetweenZeros.ListNode(3, listNode2);
        MergeNodesInBetweenZeros.ListNode listNode0 = new MergeNodesInBetweenZeros.ListNode(0, listNode1);
        MergeNodesInBetweenZeros.ListNode output1 = new MergeNodesInBetweenZeros.ListNode(11, null);
        MergeNodesInBetweenZeros.ListNode output0 = new MergeNodesInBetweenZeros.ListNode(4, output1);
        assertEquals(output0.val, MergeNodesInBetweenZeros.mergeNodes(listNode0).val);
        assertEquals(output1.val, MergeNodesInBetweenZeros.mergeNodes(listNode0).next.val);
    }
}
