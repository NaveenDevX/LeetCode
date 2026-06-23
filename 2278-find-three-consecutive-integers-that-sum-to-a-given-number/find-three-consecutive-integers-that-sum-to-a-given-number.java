class Solution {
    public long[] sumOfThree(long num) {
        long [] res = new long[3];

        if(num % 3 != 0) return new long[]{};

        long x = num / 3;

        long x_1 = x-1;
        long x_2 = x+1;

        if((x + x_1 + x_2) == num)
        {
            res[0] = x_1;
            res[1] = x;
            res[2] = x_2;
        } 
        return res;
    }
}