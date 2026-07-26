class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n<=1) return 1;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, min_idx = 0, max_idx = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] < min)
            {
                min_idx = i;
                min = nums[i];
            }
            if(nums[i] > max)
            {
                max_idx = i;
                max = nums[i];
            }
        }
        int left = Math.min(min_idx, max_idx);
        int right = Math.max(min_idx, max_idx);

        int c1 = right + 1;

        int c2 = n - left;

        int c3 = (left + 1) + (n - right);

        return Math.min(c3, Math.min(c1,c2));
    }
}