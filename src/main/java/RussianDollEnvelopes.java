import java.util.Arrays;
import java.util.TreeSet;

public class RussianDollEnvelopes {
    public static int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (arr1, arr2) -> arr1[0] == arr2[0] ? arr2[1] - arr1[1] : arr1[0] - arr2[0]);
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int[] env : envelopes) {
            Integer ceiling = treeSet.ceiling(env[1]);
            if (ceiling != null && ceiling != env[1])
                treeSet.remove(ceiling);
            treeSet.add(env[1]);
        }
        return treeSet.size();
    }
}
