class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int total=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
        
        if(total==0)
        {
            count++;
        }
        }
        return count;
        
    }
}