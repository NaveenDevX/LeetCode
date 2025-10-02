class Solution {
    public static int bitCount(long n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static int makeTheIntegerZero(int num1, int num2) {
        for (int k = 1; k <= 60; k++) {
            long ans = (long) num1 - (long) k * num2;
            if (ans < k) {
                continue;
            }
            if (bitCount(ans) <= k) {
                return k;
            }
        }
        return -1;
    }
}
