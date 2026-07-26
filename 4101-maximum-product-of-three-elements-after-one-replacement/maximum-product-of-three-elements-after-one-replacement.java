class Solution {
    public long maxProduct(int[] nums) {
        long res = 100000;
        int n = nums.length;
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = Math.abs(nums[i]);
        }
        int num1 = 0, num2 = 0;
        for(int num : arr)
        {
            if(num >= num1){
                num2 = num1;
                num1 = num;
            }
            else if(num >= num2 && num != num1)
            {
                num2 = num;
            }
        }
        long pro = (long) num1 * num2;

        return pro * res;

    }
}