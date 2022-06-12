import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] != nums[i] + 1)
                return nums[i] + 1;
        }
        return nums[0] != 0 ? 0 : nums[nums.length - 1] + 1;
    }
}
