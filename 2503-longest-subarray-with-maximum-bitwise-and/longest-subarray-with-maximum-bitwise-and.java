class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        for(int num : nums)
        {
            max = Math.max(max, num);
        }
        int max_len = 0, curr_len = 0, start = -1, longest = -1;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == max)
            {
                if(curr_len == 0)
                {
                    start = i;
                }
                curr_len++;

                if(curr_len > max_len)
                {
                    max_len = curr_len;
                    longest = start;
                }
            }
            else{
                curr_len = 0;
            }
        } 
        return max_len;
    }
}