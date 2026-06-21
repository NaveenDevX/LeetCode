class Solution {
    public int longestSubarray(int[] nums) {

        int ans = 2, count = 2;
        for(int i=2;i<nums.length;i++)
        {
             if(nums[i] == nums[i-1]+nums[i-2])
             {
                count++;
             }
             else{
                count = 2;
             }
             ans = Math.max(ans, count);
        }
        return ans;
    }
}