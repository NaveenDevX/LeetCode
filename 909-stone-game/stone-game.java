class Solution {
    public boolean stoneGame(int[] piles) {
        int s=0;
        for(int i=0;i<piles.length;i++)
        {
            s=s+piles[i];
        }
        return s%2!=0;
        
    }
}