class Solution {
    public long countCompleteDayPairs(int[] hours) {
        long ans =0;
        int [] cnt = new int[24];
        for(int h : hours)
        {
            ans += cnt[(24 - h%24)%24];
            cnt[h%24]++;
        }
        return ans;
    }
}