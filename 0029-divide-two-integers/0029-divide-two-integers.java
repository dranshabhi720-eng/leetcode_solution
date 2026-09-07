class Solution {
    public int divide(int dividend, int divisor) {
        // Edge Case: Overflow scenario
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Result ka sign decide karna
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Absolute values long mein convert karke handle karna (overflow se bachne ke liye)
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int result = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            long multiple = 1;

            // Dividend mein se divisor ke double (2x, 4x, 8x...) substract karna
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            dvd -= temp;
            result += multiple;
        }

        return negative ? -result : result;
    }
}
