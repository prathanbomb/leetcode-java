import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestStringChainTest {
    @Test
    void testcase1() {
        String[] words = {"a", "b", "ba", "bca", "bda", "bdca"};
        assertEquals(4, LongestStringChain.longestStrChain(words));
    }

    @Test
    void testcase2() {
        String[] words = {"xbc", "pcxbcf", "xb", "cxbc", "pcxbc"};
        assertEquals(5, LongestStringChain.longestStrChain(words));
    }

    @Test
    void testcase3() {
        String[] words = {"abcd", "dbqca"};
        assertEquals(1, LongestStringChain.longestStrChain(words));
    }
}
