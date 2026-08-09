class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i = discounts.length-1;
        int j = prices.length-1;
        double ans = 0;
        while(i>=0 && j>=0)
        {
            
            ans += (prices[j] * (100 - discounts[i])) / 100.0;
            i--;
            j--;
        }
        int diff = prices.length - discounts.length;
        if(diff > 0)
        {
            for(int index=0;index<diff;index++)
            {
                ans += prices[index];
            }
        }
        
        return ans;     
    }
}