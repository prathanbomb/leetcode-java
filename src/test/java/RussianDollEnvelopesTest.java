import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RussianDollEnvelopesTest {
    @Test
    void testcase1() {
        int[][] envelopes = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        assertEquals(3, RussianDollEnvelopes.maxEnvelopes(envelopes));
    }

    @Test
    void testcase2() {
        int[][] envelopes = {{1, 1}, {1, 1}, {1, 1}};
        assertEquals(1, RussianDollEnvelopes.maxEnvelopes(envelopes));
    }

    @Test
    void testcase3() {
        int[][] envelopes = {{30, 50}, {12, 2}, {3, 4}, {12, 15}};
        assertEquals(3, RussianDollEnvelopes.maxEnvelopes(envelopes));
    }

    @Test
    void testcase4() {
        int[][] envelopes = {{7, 8}, {12, 16}, {12, 5}, {1, 8}, {4, 19}, {3, 15}, {4, 10}, {9, 16}};
        assertEquals(3, RussianDollEnvelopes.maxEnvelopes(envelopes));
    }

    @Test
    void testcase5() {
        int[][] envelopes = {{2, 100}, {3, 200}, {4, 300}, {5, 500}, {5, 400}, {5, 250}, {6, 370}, {6, 360}, {7, 380}};
        assertEquals(5, RussianDollEnvelopes.maxEnvelopes(envelopes));
    }
}
