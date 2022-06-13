import java.util.HashMap;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.get(num) == null)
                map.put(num, 1);
            else
                map.replace(num, map.get(num) + 1);
        }
        int ans = 0;
        for (Integer key : map.keySet()) {
            ans += (map.get(key) * (map.get(key) - 1) / 2);
        }
        return ans;
    }
}
