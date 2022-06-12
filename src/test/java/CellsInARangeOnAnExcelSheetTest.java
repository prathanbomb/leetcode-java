import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellsInARangeOnAnExcelSheetTest {
    @Test
    void testcase1() {
        String s = "K1:L2";
        List<String> ans = Arrays.asList("K1","K2","L1","L2");
        assertEquals(ans, CellsInARangeOnAnExcelSheet.cellsInRange(s));
    }
    @Test
    void testcase2() {
        String s = "A1:F1";
        List<String> ans = Arrays.asList("A1","B1","C1","D1","E1","F1");
        assertEquals(ans, CellsInARangeOnAnExcelSheet.cellsInRange(s));
    }
}
