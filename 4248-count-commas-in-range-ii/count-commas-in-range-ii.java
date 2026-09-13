class Solution {
    public long countCommas(long n) {
        long c = 0;
        long pow = 1000;

        while(n>=pow)
        {
            c += (n-pow+1);
            pow *= 1000;
        }
        return c;
    }

}