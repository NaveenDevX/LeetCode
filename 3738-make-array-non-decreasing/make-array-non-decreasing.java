class Solution {
    public int maximumPossibleSize(int[] nums) {
        int ans =0;
        int ele =0;
        for(int num : nums)
        {
            if(ele<=num)
            {
                ele=num;
                ans++;
            }
        } 
        return ans;     
    }
}