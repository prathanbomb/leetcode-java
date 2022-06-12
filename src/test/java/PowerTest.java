import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerTest {
    @Test
    void testcase1() {
        double x = 2.00000; int n = 10;
        assertEquals(1024, Power.myPow(x, n));
    }
}
