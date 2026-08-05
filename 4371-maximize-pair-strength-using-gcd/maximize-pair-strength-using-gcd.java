class Solution {
    public long maxPairStrength(int[] nums) {
        long max = 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                long gcd = gcd(nums[i], nums[j]);
                long res = (1L * nums[i]*nums[j]) / (gcd * gcd);
                max = Math.max(max, res);
            }
        }
        return max;       
    }

    public int gcd(int a, int b)
    {
        while(b!=0)
        {
            int temp = b;
            b= a%b;
            a= temp;
        }
        return a;
    }
}