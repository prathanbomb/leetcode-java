import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueriesOnNumberOfPointsInsideACircleTest {
    @Test
    void testcase1() {
        int[][] points = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};
        int[] output = {3, 2, 2};
        assertEquals(output, QueriesOnNumberOfPointsInsideACircle.countPoints(points, queries));
    }
}
