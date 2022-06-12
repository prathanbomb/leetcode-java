import java.util.Arrays;

public class FindRotation {
    public static boolean findRotation(int[][] mat, int[][] target) {
        if (Arrays.deepEquals(mat, target))
            return true;
        for (int i = 0; i < 3; i++) {
            rotate(mat);
            if (Arrays.deepEquals(mat, target))
                return true;
        }
        return false;
    }
    public static void rotate(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[n-1-j][i];
                mat[n-1-j][i] = mat[n-1-i][n-1-j];
                mat[n-1-i][n-1-j] = mat[j][n-1-i];
                mat[j][n-1-i] = temp;
            }
        }
    }
}
