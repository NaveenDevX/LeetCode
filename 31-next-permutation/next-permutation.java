class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int ind = -1;

        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            reverse(nums, 0, len - 1);
            return;
        }

        for (int i = len - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                swap(nums, ind, i);
                break;
            }
        }

        reverse(nums, ind + 1, len - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}