import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JewelsAndStonesTest {
    @Test
    void testcase1() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        assertEquals(3, JewelsAndStones.numJewelsInStones(jewels, stones));
    }
}
