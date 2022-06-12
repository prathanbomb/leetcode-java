import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1BitsTest {
    @Test
    void testcase1() {
        int n = 0b1000001001;
        assertEquals(3, NumberOf1Bits.hammingWeight(n));
    }
}
