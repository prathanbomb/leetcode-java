import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {
    @Test
    void testcase1() {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, ContainerWithMostWater.maxArea(height));
    }
}
