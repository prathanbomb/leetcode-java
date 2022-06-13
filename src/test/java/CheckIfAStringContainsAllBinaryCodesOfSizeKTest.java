import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfAStringContainsAllBinaryCodesOfSizeKTest {
    @Test
    void testcase1() {
        String s = "00110110";
        int k = 2;
        assertTrue(CheckIfAStringContainsAllBinaryCodesOfSizeK.hasAllCodes(s, k));
    }

    @Test
    void testcase2() {
        String s = "0110";
        int k = 1;
        assertTrue(CheckIfAStringContainsAllBinaryCodesOfSizeK.hasAllCodes(s, k));
    }

    @Test
    void testcase3() {
        String s = "0110";
        int k = 2;
        assertFalse(CheckIfAStringContainsAllBinaryCodesOfSizeK.hasAllCodes(s, k));
    }
}
