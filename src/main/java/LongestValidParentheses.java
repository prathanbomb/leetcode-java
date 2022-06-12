import java.util.Stack;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        int longest = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    if (s.charAt(stack.peek()) == '(') {
                        stack.pop();
                    } else {
                        stack.push(i);
                    }
                } else {
                    stack.push(i);
                }
            }
        }
        if (stack.isEmpty()) {
            return s.length();
        } else {
            int len = s.length();
            int temp;
            while (!stack.isEmpty()) {
                temp = stack.pop();
                longest = Math.max(longest, len - temp - 1);
                len = temp;
            }
            longest = Math.max(longest, len);
        }
        return longest;
    }
}
