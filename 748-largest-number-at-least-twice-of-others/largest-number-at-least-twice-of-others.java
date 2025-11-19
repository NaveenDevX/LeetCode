class Solution {
    public int dominantIndex(int[] nums) {
       int a=-1,b=-1;
       int temp=-1;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>a)
        {
            b=a;
            a=nums[i];
            temp=i;
        }
        else if(nums[i]>b)
        {
            b= nums[i];
        }
       }
       if(b*2<=a){
        return temp;
       }
       return -1;
    }
}