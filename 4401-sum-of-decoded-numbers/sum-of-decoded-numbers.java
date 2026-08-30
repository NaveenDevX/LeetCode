class Solution {
    public int sumDecoded(long[] nums) {

        long MOD = 1000000007;
        long res = 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            long w = nums[i] % 10;
            long dec = nums[i] / 10;
            long temp = dec;
            
            int digit = 0;
            while(temp > 0)
            {
                digit++;
                temp /= 10;
            }
            long div = 1;
            for(int j=0;j<digit-w;j++)
            {
                div *= 10;
            }
            long x = dec / div;
            long y = dec % div;
            res = (res + power(x, y, MOD)) % MOD; 
        }
        return (int)res;
    }
    public long power(long a, long b, long MOD)
    {
        long res = 1;
        while(b > 0)
        {
            if(b%2 != 0)
            {
                res = (res * a) % MOD;
                b--;
            }
            else{
                b = b/2;
                a = (a*a)%MOD;
            }
        }
        return res;
    }
}