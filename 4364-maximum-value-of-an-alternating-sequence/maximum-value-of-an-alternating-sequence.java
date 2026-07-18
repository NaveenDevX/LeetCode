class Solution {
    public long maximumValue(int n, int s, int m) {
        long ans = 0;
        long space = n / 2;
        if(n == 1) return s;

        ans = (long)(s + (long)(space * m) -(long)(space-1));

        return ans;
    }
}