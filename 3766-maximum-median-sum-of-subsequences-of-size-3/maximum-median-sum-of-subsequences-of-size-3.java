class Solution {
    public long maximumMedianSum(int[] nums) {
       Arrays.sort(nums);
       int n = nums.length;
       long sum = 0;
       int i = 0, j= n-2;
       while(i<j)
       {
           sum +=(long) nums[j];
           i++;
           j -= 2;
       }

       return sum;
    }
}