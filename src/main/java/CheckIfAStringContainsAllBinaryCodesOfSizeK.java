import java.util.HashSet;

public class CheckIfAStringContainsAllBinaryCodesOfSizeK {
    public static boolean hasAllCodes(String s, int k) {
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i <= s.length() - k; i++) {
            hashSet.add(s.substring(i, i + k));
        }

        return hashSet.size() >= Math.pow(2, k);
    }
}
