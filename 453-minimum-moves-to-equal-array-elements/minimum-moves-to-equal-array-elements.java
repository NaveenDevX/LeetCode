class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        int min = Integer.MAX_VALUE;
        for(int num : nums)
        {
            min = Math.min(num, min);
        }
        for(int num : nums)
        {
            count += Math.abs(num - min);
        }
        return count;
    }    
}
