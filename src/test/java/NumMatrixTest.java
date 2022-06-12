import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumMatrixTest {
    @Test
    void testcase1() {
        int[][] array = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        NumMatrix numMatrix = new NumMatrix(array);
        assertEquals(8, NumMatrix.sumRegion(2, 1, 4, 3));
        assertEquals(11, NumMatrix.sumRegion(1, 1, 2, 2));
        assertEquals(12, NumMatrix.sumRegion(1, 2, 2, 4));
    }
}
