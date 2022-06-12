import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationSumIIITest {
    @Test
    void testcase1() {
        int k = 3;
        int n = 9;
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(1, 2, 6));
        output.add(Arrays.asList(1, 3, 5));
        output.add(Arrays.asList(2, 3, 4));
        assertEquals(output, CombinationSumIII.combinationSum3(k, n));
    }
}
