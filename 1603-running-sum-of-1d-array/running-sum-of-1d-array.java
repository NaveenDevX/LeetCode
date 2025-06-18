class Solution {
    public int[] runningSum(int[] nums) {
        int [] arr= new int[nums.length];
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            res+=nums[i];
            arr[i]=res;
        }
        return arr;
        
        
    }
}