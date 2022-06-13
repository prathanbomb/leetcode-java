import java.util.Arrays;
import java.util.Comparator;

public class MaximumProductOfWordLengths {
    public static int maxProduct(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
        int max = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (max >= words[i].length() * words[j].length())
                    break;
                System.out.println(words[i] + " " + words[j]);
                boolean distinct = true;
                for (char c : words[j].toCharArray()) {
                    if (words[i].contains(String.valueOf(c))) {
                        distinct = false;
                        break;
                    }
                }
                if (distinct) {
                    max = Math.max(words[i].length() * words[j].length(), max);
                }
            }
        }
        return max;
    }
}
