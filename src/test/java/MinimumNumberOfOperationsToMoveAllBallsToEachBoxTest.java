import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBoxTest {
    @Test
    void testcase1() {
        String boxes = "110";
        int[] ans = {1, 1, 3};
        assertEquals(ans, MinimumNumberOfOperationsToMoveAllBallsToEachBox.minOperations(boxes));
    }
}
