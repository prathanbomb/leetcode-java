import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumArrayWithUpdateTest {
    @Test
    void testcase1() {
        int[] array = {1, 3, 5};
        NumArrayWithUpdate numArray = new NumArrayWithUpdate(array);
        assertEquals(9, NumArrayWithUpdate.sumRange(0, 2));
        NumArrayWithUpdate.update(1, 2);
        assertEquals(8, NumArrayWithUpdate.sumRange(0, 2));
    }

    @Test
    void testcase2() {
        int[] array = {5, 18, 13};
        NumArrayWithUpdate numArray = new NumArrayWithUpdate(array);
        assertEquals(36, NumArrayWithUpdate.sumRange(0, 2));
        NumArrayWithUpdate.update(1, -1);
        NumArrayWithUpdate.update(2, 3);
        NumArrayWithUpdate.update(0, 5);
        NumArrayWithUpdate.update(0, -4);
        assertEquals(-2, NumArrayWithUpdate.sumRange(0, 2));
    }
}
