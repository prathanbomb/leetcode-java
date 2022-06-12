public class LongestIncreasingPathInAMatrix {
    static int[][] direction = {{-1,0},{0,-1},{1,0},{0,1}};

    public static int longestIncreasingPath(int[][] matrix) {
        int[][] visited = new int[matrix.length][matrix[0].length];
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(max, findLongest(matrix, i, j, visited, null));
            }
        }
        return max;
    }

    private static int findLongest(int[][] matrix, int x, int y, int[][] visited, Integer prev) {
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length)
            return 0;
        if (prev != null && prev >= matrix[x][y])
            return 0;
        if (visited[x][y] != 0) {
            return visited[x][y];
        } else {
            int max = 0;
            for (int[] dir : direction) {
                int nextX = x + dir[0];
                int nextY = y + dir[1];
                max = Math.max(max, findLongest(matrix, nextX, nextY, visited, matrix[x][y]));
            }
            visited[x][y] = max += 1;
            return max;
        }
    }
}
