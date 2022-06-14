public class DeleteOperationForTwoStrings {
    public static int minDistance(String word1, String word2) {
        int[][] matrix = new int[word1.length()][word2.length()];
        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                boolean match = word1.charAt(i) == word2.charAt(j);
                if (i == 0 || j == 0) {
                    if (match) {
                        matrix[i][j] = 1;
                    } else {
                        if (i == 0 && j == 0)
                            matrix[i][j] = 0;
                        else if (i == 0)
                            matrix[i][j] = matrix[i][j - 1];
                        else
                            matrix[i][j] = matrix[i - 1][j];
                    }
                } else {
                    if (match)
                        matrix[i][j] = matrix[i - 1][j - 1] + 1;
                    else
                        matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
                }
            }
        }
        int longest = matrix[word1.length() - 1][word2.length() - 1];
        return (word1.length() - longest) + (word2.length() - longest);
    }
}
