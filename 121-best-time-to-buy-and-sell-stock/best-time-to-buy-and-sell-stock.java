class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int n=prices.length;
        int minimum=prices[0];
        for(int i=1;i<n;i++)
        {
            int sell=prices[i];
            int buy=minimum;
            profit=Math.max(profit,sell-buy);
            minimum=Math.min(minimum,prices[i]);
        }
        return profit;
    }
}