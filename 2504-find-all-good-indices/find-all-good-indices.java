class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int [] lis = new int[n];
        int [] lds = new int[n];
        lis[0]=1;
        lds[0]=1;
        int c1=1, c2=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i] >= nums[i-1])
            {
                c1++;
                lis[i] = c1;
            }
            else{
                c1=1;
                lis[i]=c1;
            }
        }
        for(int i=1;i<n;i++)
        {
            if(nums[i] <= nums[i-1])
            {
                c2++;
                lds[i]=c2;
            }
            else{
                c2 = 1;
                lds[i] = c2;
            }
        }
        for(int i=k;i<n-k;i++)
        {
            if(lds[i-1] >= k && lis[i+k] >= k)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}