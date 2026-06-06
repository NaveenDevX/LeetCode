class Solution {
    public int[] leftRightDifference(int[] nums){
        int n = nums.length;
        int [] ans = new int[n];
        int left = 0, right = 0;
        for(int i=0;i<n;i++)
        {
            right += nums[i];
        }
        for(int i=0;i<n;i++)
        {
            right -= nums[i];
            ans[i] = Math.abs(right - left);
            left += nums[i];
        }
        return ans;
    }
}