class Solution {
    public int maximumGap(int[] nums) {
        int n= nums.length;
        if(n<2) return 0;
        Arrays.sort(nums);
        int m=0;
        for(int i=1;i<n;i++){
            int gap= nums[i]-nums[i-1];
            m=Math.max(m,gap);
        }
        return m;
    }

}