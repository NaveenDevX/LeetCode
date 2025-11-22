class Solution {
    public int minimumOperations(int[] nums) {
       int ans =0;
       int div =3;
       for(int num : nums)
       {
        int b= num % div;
        int c= Math.min(b,div-b);
        ans+=c;
       } 
       return ans;
    }
}