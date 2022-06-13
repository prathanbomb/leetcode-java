import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    void testcase1() {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(2));
        triangle.add(List.of(3, 4));
        triangle.add(List.of(6, 5, 7));
        triangle.add(List.of(4, 1, 8, 3));
        assertEquals(11, Triangle.minimumTotal(triangle));
    }

    @Test
    void testcase2() {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(-1));
        triangle.add(List.of(2, 3));
        triangle.add(List.of(1, -1, -3));
        assertEquals(-1, Triangle.minimumTotal(triangle));
    }
}
