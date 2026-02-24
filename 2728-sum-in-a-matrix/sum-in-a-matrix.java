class Solution {
    public int matrixSum(int[][] nums) {
        for(int [] rows : nums)
        {
            Arrays.sort(rows);
        }
        int sum =0;
        for(int i=0;i<nums[0].length;i++)
        {
            int max =nums[0][i];
            for(int j=1;j<nums.length;j++)
            {
                if(nums[j][i]>max)
                {
                    max= nums[j][i];
                }
            }
            sum+=max;
        }
        return sum;
    }
}