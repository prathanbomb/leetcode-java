import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {
    @Test
    void testcase1() {
        String s = "III";
        assertEquals(3, RomanToInteger.romanToInt(s));
    }
}
