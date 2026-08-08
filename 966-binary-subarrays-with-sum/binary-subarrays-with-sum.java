class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal-1);
    }
    public int atMost(int [] nums, int goal)
    {
        if(goal < 0) return 0;
        int left=0, sum=0,ans=0;
        int n = nums.length;
        for(int right =0;right<n;right++)
        {
            sum += nums[right];
            while(sum > goal)
            {
                sum -= nums[left];
                left++;
            }
            ans += (right-left+1);
        }

        return ans;
    }
}