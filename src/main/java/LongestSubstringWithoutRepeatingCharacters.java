import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mem = new HashMap<>();
        int l=0, max=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(mem.containsKey(c)){
                l=Math.max(l,mem.get(c)+1);
            }
            mem.put(c,i);
            max = Math.max(max, (i-l+1));
        }
        return max;
    }
}
