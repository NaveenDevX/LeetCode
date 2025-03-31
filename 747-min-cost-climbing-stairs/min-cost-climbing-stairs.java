class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        if(n==1){
            return cost[0];
        }
        int p1=cost[0];
        int p2=cost[1];
        for(int i=2;i<n;i++)
        {
            int curr=cost[i]+Math.min(p1,p2);
            p1=p2;
            p2=curr;
        }
        return Math.min(p1,p2);
        
    }
}