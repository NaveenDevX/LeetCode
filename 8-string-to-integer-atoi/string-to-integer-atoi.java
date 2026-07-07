class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        if(n==0) return 0;

        int i = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        

        while(i < n && s.charAt(i)== ' ') i++;

        if(i == n) return 0;

        int sign = 1;
        if(s.charAt(i)=='-' || s.charAt(i)=='+')
        {
            if(s.charAt(i)=='-') sign = -1;

            i++;
        }
        

        long num = 0;

        while(i<n && Character.isDigit(s.charAt(i)))
        {
            long temp = s.charAt(i)-'0';
            num = num * 10 + temp;

            if(sign * num <= min)
            {
                return min;
            }
            if(sign * num >= max)
            {
                return max;
            }
            i++;
        }

        return (int) num * sign;

    }
}