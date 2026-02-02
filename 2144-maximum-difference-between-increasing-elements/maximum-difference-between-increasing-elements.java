class Solution {
    public int maximumDifference(int[] nums) {
        int diff =0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if( (i<j) && (nums[i] < nums[j]))
                {
                    diff= Math.max(diff,Math.abs(nums[j]-nums[i]));
                }
            }
        }
        return diff==0 ?  -1 : diff;
    }
}