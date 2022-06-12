import java.util.HashSet;

public class MaximumErasureValue {
    public static int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxSum = 0;
        int curSum = 0;
        int left = 0;
        for (int num : nums) {
            while (set.contains(num)) {
                set.remove(nums[left]);
                curSum -= nums[left];
                left++;
            }
            set.add(num);
            curSum += num;
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
}
