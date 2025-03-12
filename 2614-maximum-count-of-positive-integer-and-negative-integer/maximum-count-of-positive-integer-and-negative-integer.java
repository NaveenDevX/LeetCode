class Solution {
    public int maximumCount(int[] nums) {
        int positive = 0, negative = 0, result = 0;

        for (int num : nums) {
            if (num > 0) {
                ++positive;
            }
            else if(num<0) {
                ++negative;
            }
            result = Math.max(result, Math.max(positive, negative));
        }
        return result;
    }
}