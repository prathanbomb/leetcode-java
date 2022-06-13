import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterCombinationsOfAPhoneNumberTest {
    @Test
    void testcase1() {
        String digits = "23";
        List<String> ans = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(ans, LetterCombinationsOfAPhoneNumber.letterCombinations(digits));
    }
}
