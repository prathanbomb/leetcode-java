import java.util.HashMap;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < stones.length(); i++) {
            if (map.get(stones.charAt(i)) == null)
                map.put(stones.charAt(i), 1);
            else
                map.replace(stones.charAt(i), map.get(stones.charAt(i)) + 1);
        }
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            if (map.get(jewels.charAt(i)) != null) {
                count += map.get(jewels.charAt(i));
            }
        }
        return count;
    }
}
