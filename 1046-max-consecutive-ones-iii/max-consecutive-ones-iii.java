class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0;
        int zeroes=0;
        int left=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zeroes+=1;
            }
            while(zeroes>k)
            {
                if(nums[left]==0)
                {
                    zeroes-=1;
                }
                left+=1;
            }
            count=Math.max(count,(i-left+1));
        }
        return count;
        
    }
}