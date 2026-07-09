class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int res = 0;
        int n = nums.length;
        int res1= 0;
        for(int num : nums)
        {
            if(num == k) res1++;
        }
        for(int i=0;i<n;i++)
        {
            int curr = nums[i];
            for(int j=i+1;j<n;j++)
            {
                curr = gcd(curr, nums[j]);

                if(curr == k) res++;
            }
        }
        return res + res1;
    }

    public int gcd(int a , int b){
        if(b==0) return a;

        while(b!=0){
            int temp = b;
            b= a%b;
            a= temp;
        }

        return a;

    }
}