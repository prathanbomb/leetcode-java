import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestValidParenthesesTest {
    @Test
    void testcase1() {
        String s = "()(())";
        assertEquals(6, LongestValidParentheses.longestValidParentheses(s));
    }

    @Test
    void testcase2() {
        String s = ")()())";
        assertEquals(4, LongestValidParentheses.longestValidParentheses(s));
    }

    @Test
    void testcase3() {
        String s = "";
        assertEquals(0, LongestValidParentheses.longestValidParentheses(s));
    }

    @Test
    void testcase4() {
        String s = "()(()";
        assertEquals(2, LongestValidParentheses.longestValidParentheses(s));
    }

    @Test
    void testcase5() {
        String s = "(()";
        assertEquals(2, LongestValidParentheses.longestValidParentheses(s));
    }
}
