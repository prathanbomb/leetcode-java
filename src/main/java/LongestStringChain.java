import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LongestStringChain {
    public static int longestStrChain(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        Map<String, Integer> dp = new HashMap<>();
        int longest = 1;
        for (String word : words) {
            int temp = 1;
            for (int i = 0; i < word.length(); i++) {
                StringBuilder builder = new StringBuilder(word);
                builder.deleteCharAt(i);
                temp = Math.max(temp, dp.getOrDefault(builder.toString(), 0) + 1);
            }
            dp.put(word, temp);
            longest = Math.max(longest, temp);
        }
        return longest;
    }
}
