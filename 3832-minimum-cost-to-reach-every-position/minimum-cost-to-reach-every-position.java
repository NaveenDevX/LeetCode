class Solution {
    public int[] minCosts(int[] cost) {
        int n=cost.length;
        int [] ans=new int [n];
        int a=cost[0];
        ans[0]=a;
        for(int i=1;i<n;i++)
        {
            a=Math.min(cost[i],a);
            ans[i] = a;
        }
        return ans;
        
    }
}