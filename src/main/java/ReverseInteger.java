public class ReverseInteger {
    public static int reverse(int x) {
        int ans = 0;
        boolean positive = x >= 0;
        x = Math.abs(x);
        while (x > 0) {
            if (ans != 0)
                ans *= 10;
            if (ans % 10 != 0)
                return 0;
            ans += (x % 10);
            x /= 10;
        }
        return positive ? ans : -ans;
    }
}
