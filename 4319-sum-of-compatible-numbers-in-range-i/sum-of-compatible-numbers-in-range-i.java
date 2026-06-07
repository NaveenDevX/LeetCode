class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int x=0;
        int start = Math.max(0,n-k);
        int end = n+k;
        for(int i=start;i<=end;i++)
        {
            if(Math.abs(n-i)<=k && (n & i)==0)
            {
                x+=i;
            }
        }
        return x;
    }
}