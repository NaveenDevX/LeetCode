class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max=0;
        int left =0;
        int right = nums.length-1;
        while(left<right)
        {
            int a = nums[left];
            int b= nums[right];
            int sum = a+b;
            max= Math.max(max, sum);
            left++;
            right--;
        }
        return max;

    }
}