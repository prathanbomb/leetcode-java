import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteOperationForTwoStringsTest {
    @Test
    void testcase1() {
        String word1 = "sea", word2 = "eat";
        assertEquals(2, DeleteOperationForTwoStrings.minDistance(word1, word2));
    }

    @Test
    void testcase2() {
        String word1 = "leetcode", word2 = "etco";
        assertEquals(4, DeleteOperationForTwoStrings.minDistance(word1, word2));
    }

    @Test
    void testcase3() {
        String word1 = "a", word2 = "ab";
        assertEquals(1, DeleteOperationForTwoStrings.minDistance(word1, word2));
    }
}
