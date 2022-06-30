//Given an integer array nums of size n, return the minimum number of moves
//required to make all array elements equal.
//
// In one move, you can increment or decrement an element of the array by 1.
//
// Test cases are designed so that the answer will fit in a 32-bit integer.
//
//
// Example 1:
//
//
//Input: nums = [1,2,3]
//Output: 2
//Explanation:
//Only two moves are needed (remember each move increments or decrements one
//element):
//[1,2,3]  =>  [2,2,3]  =>  [2,2,2]
//
//
// Example 2:
//
//
//Input: nums = [1,10,2,9]
//Output: 16
//
//
//
// Constraints:
//
//
// n == nums.length
// 1 <= nums.length <= 10⁵
// -10⁹ <= nums[i] <= 10⁹
//
// Related Topics Array Math Sorting 👍 1946 👎 86


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class MinMoves2 {
    public static int minMoves2(int[] nums) {
        int min = 0;
        Arrays.sort(nums);
        int median = nums[nums.length / 2];
        for (int num : nums) {
            min += Math.abs(median - num);
        }
        return min;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
