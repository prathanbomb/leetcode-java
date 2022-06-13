import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumErasureValueTest {
    @Test
    void testcase1() {
        int[] nums = {4, 2, 4, 5, 6};
        assertEquals(17, MaximumErasureValue.maximumUniqueSubarray(nums));
    }

    @Test
    void testcase2() {
        int[] nums = {5, 2, 1, 2, 5, 2, 1, 2, 5};
        assertEquals(8, MaximumErasureValue.maximumUniqueSubarray(nums));
    }

    @Test
    void testcase3() {
        int[] nums = {187, 470, 25, 436, 538, 809, 441, 167, 477, 110, 275, 133, 666, 345, 411, 459, 490, 266, 987, 965, 429, 166, 809, 340, 467, 318, 125, 165, 809, 610, 31, 585, 970, 306, 42, 189, 169, 743, 78, 810, 70, 382, 367, 490, 787, 670, 476, 278, 775, 673, 299, 19, 893, 817, 971, 458, 409, 886, 434};
        assertEquals(16911, MaximumErasureValue.maximumUniqueSubarray(nums));
    }
}
