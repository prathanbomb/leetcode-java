import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TargetSumTest {
    @Test
    void testcase1() {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        assertEquals(5, TargetSum.findTargetSumWays(nums, target));
    }

    @Test
    void testcase2() {
        int[] nums = {1};
        int target = 1;
        assertEquals(1, TargetSum.findTargetSumWays(nums, target));
    }
}
