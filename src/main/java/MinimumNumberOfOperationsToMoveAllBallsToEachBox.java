public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public static int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < boxes.length(); j++) {
                if (i != j) {
                    if (boxes.charAt(j) == '1')
                        ans[i] += Math.abs(j - i);
                }
            }
        }
        return ans;
    }
}
