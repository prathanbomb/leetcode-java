import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {
    @Test
    void testcase1() {
        int[] nums = {3,0,1};
        assertEquals(2, MissingNumber.missingNumber(nums));
    }
}
