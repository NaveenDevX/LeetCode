class Solution {
    public int alternatingSum(int[] nums) {
        int n= nums.length;
        int sum=0;
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            if(i%2==0)
            {
                a+=nums[i];
            }
            else{
                b+=nums[i];
            }
        }
        return a-b;
    }
}