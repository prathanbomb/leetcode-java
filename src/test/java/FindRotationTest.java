import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindRotationTest {
    @Test
    void testcase1() {
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};
        assertTrue(FindRotation.findRotation(mat, target));
    }
}
