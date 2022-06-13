import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransposeMatrixTest {
    @Test
    void testcase1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] ans = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        assertEquals(ans, TransposeMatrix.transpose(matrix));
    }

    @Test
    void testcase2() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] ans = {{1, 4}, {2, 5}, {3, 6}};
        assertEquals(ans, TransposeMatrix.transpose(matrix));
    }
}
