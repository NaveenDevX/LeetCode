class Solution {
    public boolean isGoodArray(int[] nums) {
        int n = nums.length;
        if(n==1 && nums[0]==1) return true; 

        int ans = nums[0];
        for(int i=1;i<n;i++){
            ans = gcd(ans, nums[i]);
            if(ans == 1) return true;
        }

        return false;
    }

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
}