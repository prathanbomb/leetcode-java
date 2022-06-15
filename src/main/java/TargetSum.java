public class TargetSum {
    public static int findTargetSumWays(int[] nums, int target) {
        return bfs(nums, target, 0, 0);
    }

    public static int bfs(int[] nums, int target, int sum, int index) {
        if (index == nums.length)
            return sum == target ? 1 : 0;
        return bfs(nums, target, sum + nums[index], index + 1) + bfs(nums, target, sum - nums[index], index + 1);
    }
}
