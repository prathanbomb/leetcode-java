public class QueriesOnNumberOfPointsInsideACircle {
    static public int[] countPoints(int[][] points, int[][] queries) {
        int[] output = new int[queries.length];
        for (int[] point : points) {
            for (int j = 0; j < queries.length; j++) {
                if (Math.abs(euclideanDistance(queries[j][0], point[0], queries[j][1], point[1])) <= queries[j][2])
                    output[j]++;
            }
        }
        return output;
    }

    static double euclideanDistance(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
