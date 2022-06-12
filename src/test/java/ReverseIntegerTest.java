import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {
    @Test
    void testcase1() {
        int x = 123;
        assertEquals(321, ReverseInteger.reverse(x));
    }
}
