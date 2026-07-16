class Solution {
    public int gcd(int a, int b)
    {
        if(b==0) return a;

        while(b!=0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public long gcdSum(int[] nums) {
        int n = nums.length;
        int [] pre = new int[n];
        int max = 0;
        for(int i=0;i<n;i++)
        {
            max = Math.max(nums[i], max);
            pre[i] = gcd(nums[i], max);
        }

        Arrays.sort(pre);

        int left = 0, right = pre.length-1;
        long sum = 0;
        while(left < right)
        {
            sum += (long)gcd(pre[left], pre[right]);
            left++;
            right--;
        }

        return sum;
    }
    
}