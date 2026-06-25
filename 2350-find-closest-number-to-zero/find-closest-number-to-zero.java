class Solution {
    public int findClosestNumber(int[] nums) {
        int max = Integer.MAX_VALUE;
        for(int num : nums)
        {
            if(Math.abs(num) <= Math.abs(max) && Math.abs(num)!=max)
            {
                max = num;
            }
        }
        return max;
    }
}