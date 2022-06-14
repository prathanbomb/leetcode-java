import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CreateTargetArrayInTheGivenOrderTest {
    @Test
    void testcase1() {
        int[] nums = {0, 1, 2, 3, 4}, index = {0, 1, 2, 2, 1};
        int[] out = {0, 4, 1, 3, 2};
        assertArrayEquals(out, CreateTargetArrayInTheGivenOrder.createTargetArray(nums, index));
    }
}
