class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        boolean zero = false;
        int res = 0;
        for(int num : nums)
        {
            res ^= num;
            if(num != 0) zero = true;
        }
        if(res > 0) return n;

        return (zero)? n-1 : 0;
    }
}