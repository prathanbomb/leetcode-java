import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> allComb = new ArrayList<>();
        List<Integer> comb = new ArrayList();
        findComb(allComb, comb, k, n, 0, 1);
        return allComb;
    }

    private static void findComb(List<List<Integer>> allComb, List<Integer> comb, int k, int n, int sum, int index) {
        if (comb.size() == k && sum == n) {
            allComb.add(new ArrayList<>(comb));
            return;
        }
        if (sum > n || comb.size() > k)
            return;
        for (int i = index; i <= 9; i++) {
            comb.add(i);
            findComb(allComb, comb, k, n, sum + i,i+1);
            comb.remove(comb.size()-1);
        }
    }

}