import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestPathInBinaryMatrixTest {

    @Test
    void testcase1() {
        int[][] grid = {{0,0,0},{1,1,0},{1,1,0}};
        assertEquals(4, ShortestPathInBinaryMatrix.shortestPathBinaryMatrix(grid));
    }

    @Test
    void testcase2() {
        int[][] grid = {{0,1},{1,0}};
        assertEquals(2, ShortestPathInBinaryMatrix.shortestPathBinaryMatrix(grid));
    }
}
