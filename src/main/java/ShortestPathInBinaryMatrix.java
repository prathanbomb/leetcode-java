import java.util.ArrayDeque;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {

    public static class Pair {
        public int row;
        public int column;
        public Pair(int row, int column) {
            this.row = row;
            this.column = column;
        }

        @Override
        public String toString() {
            return row + ", " + column;
        }
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] != 0)
            return -1;
        int cost = 0;
        int lenX = grid.length - 1;
        int lenY = grid[0].length - 1;
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(0,0));
        while (!queue.isEmpty()) {
            cost++;
            for (int i = queue.size(); i > 0; i--) {
                Pair cur = queue.poll();
                if (cur.row == lenX && cur.column == lenY && grid[cur.row][cur.column] == 0)
                    return cost;
                if (grid[cur.row][cur.column] == 0) {
                    grid[cur.row][cur.column] = 1;
                    if (cur.row > 0) {
                        queue.add(new Pair(cur.row - 1, cur.column));
                    }
                    if (cur.column > 0) {
                        queue.add(new Pair(cur.row, cur.column - 1));
                    }
                    if (cur.row > 0 && cur.column > 0) {
                        queue.add(new Pair(cur.row - 1, cur.column - 1));
                    }
                    if (cur.row < lenX) {
                        queue.add(new Pair(cur.row + 1, cur.column));
                    }
                    if (cur.column < lenY) {
                        queue.add(new Pair(cur.row, cur.column + 1));
                    }
                    if (cur.row < lenX && cur.column < lenY) {
                        queue.add(new Pair(cur.row + 1, cur.column + 1));
                    }
                    if (cur.row < lenX && cur.column > 0) {
                        queue.add(new Pair(cur.row + 1, cur.column - 1));
                    }
                    if (cur.row > 0 && cur.column < lenY) {
                        queue.add(new Pair(cur.row - 1, cur.column + 1));
                    }
                }
            }

        }
        return -1;
    }

}
