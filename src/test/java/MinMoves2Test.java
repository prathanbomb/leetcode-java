import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMoves2Test {
    @Test
    void testcase1() {
        int[] nums = {1, 2, 3};
        int output = 2;
        assertEquals(output, MinMoves2.minMoves2(nums));
    }

    @Test
    void testcase2() {
        int[] nums = {1, 10, 2, 9};
        int output = 16;
        assertEquals(output, MinMoves2.minMoves2(nums));
    }
}
