public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max = 0;
        int low = 0;
        int high = height.length - 1;
        while (low < high) {
            int area = Math.min(height[low], height[high]) * (high - low);
            if (area > max)
                max = area;
            if (height[low] < height[high])
                low++;
            else
                high--;
        }
        return max;
    }
}
