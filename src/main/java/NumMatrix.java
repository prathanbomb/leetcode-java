public class NumMatrix {
    static int[][] sum;

    public NumMatrix(int[][] matrix) {
        sum = new int[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (row == 0 && col == 0)
                    sum[row][col] = matrix[row][col];
                else if (row == 0 && col > 0)
                    sum[row][col] = matrix[row][col] + sum[row][col - 1];
                else if (row > 0 && col == 0)
                    sum[row][col] = matrix[row][col] + sum[row - 1][col];
                else
                    sum[row][col] = matrix[row][col] + sum[row - 1][col] + sum[row][col - 1] - sum[row - 1][col - 1];
            }
        }
    }

    public static int sumRegion(int row1, int col1, int row2, int col2) {
        if (row1 == 0 && col1 == 0)
            return sum[row2][col2];
        else if (row1 == 0)
            return sum[row2][col2] - sum[row2][col1 - 1];
        else if (col1 == 0)
            return sum[row2][col2] - sum[row1 - 1][col2];
        else
            return sum[row2][col2] - sum[row1 - 1][col2] - sum[row2][col1 - 1] + sum[row1 - 1][col1 - 1];
    }
}
