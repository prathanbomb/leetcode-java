import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    void testcase1() {
        int[] nums = {1, 1, 2};
        assertEquals(2, RemoveDuplicatesFromSortedArray.removeDuplicates(nums));
    }

    @Test
    void testcase2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, RemoveDuplicatesFromSortedArray.removeDuplicates(nums));
    }
}
