class Solution {
    public int subsetXORSum(int[] nums) {
       int res = 0;
       int n= nums.length;
       for(int i=0;i<n;i++)
       {
        res= res | nums[i];
       } 
       int ans = res << (n-1);
       return ans;
    }
}