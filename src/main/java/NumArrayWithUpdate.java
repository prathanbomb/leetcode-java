public class NumArrayWithUpdate {
    static int[] matrix;

    public NumArrayWithUpdate(int[] nums) {
        matrix = nums;
    }

    public static void update(int index, int val) {
        matrix[index] = val;
    }

    public static int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += matrix[i];
        }
        return sum;
    }
}
