import java.util.Stack;

public class PathWithMinimumEffort {

    public static void main(String[] args) {
        int[][] grid = {{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        System.out.println(minimumEffortPath(grid));
    }

    public static int minimumEffortPath(int[][] heights) {
        int lo = 0, hi = (int) 10e6;
        while (lo < hi) {
            int mid = (hi + lo) / 2;
            if (dfs(heights, mid)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return hi;
    }

    public static boolean dfs(int[][] grid, int target) {
        int h = grid.length;
        int l = grid[0].length;
        boolean[][] visited = new boolean[h][l];
        Stack<Node> stack = new Stack<>();
        Integer prevNode = null;

        stack.push(new Node(0, 0));

        while (!stack.empty()) {
            Node node = stack.pop();
            int row = node.row;
            int col = node.col;

            if (row < 0 || col < 0 || row >= h || col >= l || visited[row][col])
                continue;

            if (prevNode != null) {
                if (Math.abs(grid[row][col] - prevNode) > target)
                    continue;
            }

            prevNode = grid[row][col];
            visited[row][col] = true;

            if ((row == h - 1) && (col == l - 1)) {
                return true;
            }

            stack.push(new Node(row, col - 1)); // left
            stack.push(new Node(row, col + 1)); // right
            stack.push(new Node(row - 1, col)); // up
            stack.push(new Node(row + 1, col)); // down
        }

        return false;
    }

    static class Node {
        int row, col;

        public Node(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

}
