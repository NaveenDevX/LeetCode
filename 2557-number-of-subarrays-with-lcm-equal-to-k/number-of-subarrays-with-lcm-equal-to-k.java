class Solution {

    public int gcd(int a, int b)
    {
        if(b==0) return a;

        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }

        return a;
    }
    public int lcm(int a, int b){
        return (int)(((long)a * b) / gcd(a, b));
    }
    public int subarrayLCM(int[] nums, int k) {
        int res = 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int curr = 1;
            for(int j=i;j<n;j++)
            {
                curr = lcm(curr, nums[j]);

                if(curr > k) break;
                if(curr == k) res++;              
            }
        }
        return res;
    }
}