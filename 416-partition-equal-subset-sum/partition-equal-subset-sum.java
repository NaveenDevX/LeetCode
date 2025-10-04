class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int half= sum / 2;
        boolean[][] dp = new boolean[nums.length][half+1];
        for(int i=0;i<nums.length;i++){
            dp[i][0]= true;
         }
        if(nums[0]<= half){
            dp[0][nums[0]]= true;
        }
        for(int i=1;i<nums.length;i++){
            for(int j=1;j<= half;j++){
                boolean nt= dp[i-1][j];
                boolean t= false;

                if(nums[i]<=j){
                    t= dp[i-1][j- nums[i]];

                }
                dp[i][j]= nt || t;
            }
        }
        return dp[nums.length-1][half];
       
    }
}