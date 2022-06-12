public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        boolean negative = dividend < 0 ^ divisor < 0;
        int counter = 0;
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == 1)
                return Integer.MIN_VALUE;
            else if (divisor == -1)
                return Integer.MAX_VALUE;
            else if (divisor == Integer.MIN_VALUE)
                return 1;
            else if (divisor == Integer.MAX_VALUE)
                return -1;
            else {
                if (divisor > 0)
                    dividend += divisor;
                else
                    dividend -= divisor;
                counter = 1;
            }
        }
        if (divisor == Integer.MIN_VALUE)
            return 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        if (divisor == 1){
            counter += dividend;
            return negative ? -counter : counter;
        }
        while (dividend >= divisor) {
            dividend -= divisor;
            counter++;
        }
        return negative ? -counter : counter;
    }
}
