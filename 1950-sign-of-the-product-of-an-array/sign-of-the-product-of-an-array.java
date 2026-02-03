class Solution {
    public int arraySign(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                nums[i]=-1;
            }
            if(nums[i]>0)
            {
                nums[i]=1;
            }
        }
        for(int num : nums)
        {
            if(num==0) return 0;
        }
        int pro = 1;
        for(int num : nums)
        {
            pro*=num;
        }
        return pro;
    }
}