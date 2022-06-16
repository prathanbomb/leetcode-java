import java.util.HashMap;
import java.util.Map;

public class TargetSum {
    public static int findTargetSumWays(int[] nums, int target) {
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 1);
        for (int num : nums) {
            Map<Integer, Integer> next = new HashMap<>();
            for (int tempSum : dp.keySet()) {
                next.put(tempSum + num, next.getOrDefault(tempSum + num, 0) + dp.get(tempSum));
                next.put(tempSum - num, next.getOrDefault(tempSum - num, 0) + dp.get(tempSum));
            }
            dp = next;
        }
        return dp.getOrDefault(target, 0);
    }
}
