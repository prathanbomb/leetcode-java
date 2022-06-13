import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestIncreasingPathInAMatrixTest {
    @Test
    void testcase1() {
        int[][] matrix = {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
        assertEquals(4, LongestIncreasingPathInAMatrix.longestIncreasingPath(matrix));
    }

    @Test
    void testcase2() {
        int[][] matrix = {{3, 4, 5}, {3, 2, 6}, {2, 2, 1}};
        assertEquals(4, LongestIncreasingPathInAMatrix.longestIncreasingPath(matrix));
    }

    @Test
    void testcase3() {
        int[][] matrix = {{2147483647, 1}};
        assertEquals(2, LongestIncreasingPathInAMatrix.longestIncreasingPath(matrix));
    }
}
