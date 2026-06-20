class Solution {
    public int pivotInteger(int n) {
        int sum =0;
        sum = n*(n+1)/2;
        int temp = 0;
        for(int i=n;i>=0;i--)
        {
            temp+=i;
            if(sum == temp) return i;

            temp+=i;
        }
        return -1;
    }
}