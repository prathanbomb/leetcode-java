public class LongestPalindromicSubstring {
    public static String longestPalindrome(String str) {
        int len = str.length();
        boolean[][] dp = new boolean[len][len];
        int start = 0, end = 0;
        for (int gap = 0; gap < len; gap++) {
            for (int i = 0, j = gap; j < len; i++, j++) {
                if (gap == 0) {
                    dp[i][j] = true;
                    continue;
                }
                if (str.charAt(i) == str.charAt(j)) {
                    if (gap == 1 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return str.substring(start, end + 1);
    }
}
