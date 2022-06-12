import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PopulatingNextRightPointersInEachNodeIITest {
    @Test
    void testcase1() {
        PopulatingNextRightPointersInEachNodeII.Node node7 = new PopulatingNextRightPointersInEachNodeII.Node(7, null, null, null);
        PopulatingNextRightPointersInEachNodeII.Node node5 = new PopulatingNextRightPointersInEachNodeII.Node(5, null, null, null);
        PopulatingNextRightPointersInEachNodeII.Node node4 = new PopulatingNextRightPointersInEachNodeII.Node(4, null, null, null);
        PopulatingNextRightPointersInEachNodeII.Node node3 = new PopulatingNextRightPointersInEachNodeII.Node(3, null, node7, null);
        PopulatingNextRightPointersInEachNodeII.Node node2 = new PopulatingNextRightPointersInEachNodeII.Node(2, node4, node5, null);
        PopulatingNextRightPointersInEachNodeII.Node node1 = new PopulatingNextRightPointersInEachNodeII.Node(1, node2, node3, null);
        PopulatingNextRightPointersInEachNodeII.Node outputNode7 = new PopulatingNextRightPointersInEachNodeII.Node(1, null, null, null);
        PopulatingNextRightPointersInEachNodeII.Node outputNode5 = new PopulatingNextRightPointersInEachNodeII.Node(1, null, null, outputNode7);
        PopulatingNextRightPointersInEachNodeII.Node outputNode4 = new PopulatingNextRightPointersInEachNodeII.Node(1, null, null, outputNode5);
        PopulatingNextRightPointersInEachNodeII.Node outputNode3 = new PopulatingNextRightPointersInEachNodeII.Node(1, null, outputNode7, null);
        PopulatingNextRightPointersInEachNodeII.Node outputNode2 = new PopulatingNextRightPointersInEachNodeII.Node(1, outputNode4, outputNode5, outputNode3);
        PopulatingNextRightPointersInEachNodeII.Node outputNode1 = new PopulatingNextRightPointersInEachNodeII.Node(1, outputNode2, outputNode3, null);
        assertEquals(outputNode1, PopulatingNextRightPointersInEachNodeII.connect(node1));
    }
}
