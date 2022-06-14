import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxIncreaseToKeepCitySkylineTest {
    @Test
    void testcase1() {
        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        assertEquals(35, MaxIncreaseToKeepCitySkyline.maxIncreaseKeepingSkyline(grid));
    }
}
