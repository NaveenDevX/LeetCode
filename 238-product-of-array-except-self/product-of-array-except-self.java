class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] prefix = new int[n];
        int [] suffix = new int[n];
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        for(int i=1;i<n;i++)
        {
            prefix[i] = prefix[i-1] * nums[i];
        }
        for(int i=n-2;i>=0;i--)
        {
            suffix[i] = suffix[i+1] * nums[i];
        }
        int [] res = new int[n];
        res[0]=suffix[1];
        res[n-1] = prefix[n-2];
        for(int i=1;i<n-1;i++)
        {
            res[i] = prefix[i-1] * suffix[i+1];
        }
        return res;
    }
}
// 1 2 3 4
// pre = 1 2 6 24
//suff = 24 24 12 4
// ans[0] = suff[0]
//ans[1] = 12
//ans[2] = 8
//ans[3] = 6