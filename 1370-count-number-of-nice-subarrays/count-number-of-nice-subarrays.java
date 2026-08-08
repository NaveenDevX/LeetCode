class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       return atMost(nums, k) - atMost(nums, k-1);
    }
    public int atMost(int [] nums, int k)
    {
        if(k<0)return 0;
        int n = nums.length;
        int left=0, sum=0, ans=0;
        for(int right =0;right <n;right++)
        {
            if(nums[right]%2==1)
            {
                sum++;
            }
            while(sum > k)
            {
                if(nums[left]%2==1)sum--;

                left++;
            }
            ans += (right - left +1);
        }
        return ans;
    }
}