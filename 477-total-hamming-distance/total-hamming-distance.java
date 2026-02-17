class Solution {
    public int totalHammingDistance(int[] nums) {
        int n =nums.length;
        int count =0;
        for(int i=0;i<n;i++)
        {
            int n1= nums[i];
            for(int j=i+1;j<n;j++)
            {
                int ans = n1 ^ nums[j];
                count+=Integer.bitCount(ans);
            }
        }
        return count;
    }
}