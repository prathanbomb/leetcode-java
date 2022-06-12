import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet {
    public static List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        for (char col = s.charAt(0); col <= s.charAt(3); col++) {
            for (char row = s.charAt(1); row <= s.charAt(4); row++) {
                res.add(col + "" + row);
            }
        }
        return res;
    }
}
