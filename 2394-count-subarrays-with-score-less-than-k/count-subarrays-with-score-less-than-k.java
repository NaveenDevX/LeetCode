class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long sum = 0;
        long count = 0;
        int l = 0, r = 0;
        while (r < n) {
            sum += nums[r];

            long product = sum * (r - l + 1);
            while (l <= r && product >= k) {
                sum -= nums[l];
                l++;
                product = sum * (r - l + 1);
            }
            count += (r - l + 1);
            r++;
        }
        return count;
    }
}