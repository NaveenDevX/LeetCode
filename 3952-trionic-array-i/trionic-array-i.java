class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        boolean p = false;
        boolean q = false;
        boolean p1= false;
        int i=0;
        while(i+1<n && nums[i]<nums[i+1])
        {
            i++;
            p = true;
        }
        while(i+1<n && nums[i]>nums[i+1])
        {
            i++;
            q= true;
        }
        while(i+1<n && nums[i]<nums[i+1])
        {
            i++;
            p1= true;
        }
        while(!p) return false;
        while(!q) return false;
        while(!p1) return false;
        return i==n-1;
    }
}