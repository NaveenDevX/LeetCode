class Solution {
    public int countPartitions(int[] nums){
        int sum=0;
        int n= nums.length;
        for(int num: nums){
            sum+=num;
        }
        int left=0;
        int count=0;
        for(int i=0;i<n-1;i++){
            left+=nums[i];
            int right= sum-left;
            int diff= right-left;
            if(diff%2 == 0) count++;                    
        }
        return count;
           
    } 
}