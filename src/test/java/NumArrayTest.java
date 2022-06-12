import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumArrayTest {

    @Test
    void testcase1() {
        int[] array = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(array);
        assertEquals(1, NumArray.sumRange(0, 2));
        assertEquals(-1, NumArray.sumRange(2, 5));
        assertEquals(-3, NumArray.sumRange(0, 5));
    }
}
