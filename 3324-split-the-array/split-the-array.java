class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int [] ans = new int [101];
        for( int n : nums)
        {
            ans[n]++;
            if(ans[n]>2){
                return false;
            }
        }
        return true;
       
    }
}