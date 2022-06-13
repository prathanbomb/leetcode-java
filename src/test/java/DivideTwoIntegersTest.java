import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTwoIntegersTest {
    @Test
    void testcase1() {
        int dividend = 10, divisor = 3;
        assertEquals(3, DivideTwoIntegers.divide(dividend, divisor));
    }

    @Test
    void testcase2() {
        int dividend = 7, divisor = -3;
        assertEquals(-2, DivideTwoIntegers.divide(dividend, divisor));
    }

    @Test
    void testcase3() {
        int dividend = -1, divisor = 1;
        assertEquals(-1, DivideTwoIntegers.divide(dividend, divisor));
    }

    @Test
    void testcase4() {
        int dividend = 1, divisor = -1;
        assertEquals(-1, DivideTwoIntegers.divide(dividend, divisor));
    }

    @Test
    void testcase5() {
        int dividend = -2147483648, divisor = -1;
        assertEquals(2147483647, DivideTwoIntegers.divide(dividend, divisor));
    }

    @Test
    void testcase6() {
        int dividend = -2147483648, divisor = 1;
        assertEquals(-2147483648, DivideTwoIntegers.divide(dividend, divisor));
    }

    @Test
    void testcase7() {
        int dividend = -2147483648, divisor = 2;
        assertEquals(-1073741824, DivideTwoIntegers.divide(dividend, divisor));
    }

    @Test
    void testcase8() {
        int dividend = -2147483648, divisor = 3;
        assertEquals(-715827882, DivideTwoIntegers.divide(dividend, divisor));
    }

    @Test
    void testcase9() {
        int dividend = -2147483648, divisor = 4;
        assertEquals(-536870912, DivideTwoIntegers.divide(dividend, divisor));
    }

    @Test
    void testcase10() {
        int dividend = 2147483647, divisor = -2;
        assertEquals(-1073741823, DivideTwoIntegers.divide(dividend, divisor));
    }
}
