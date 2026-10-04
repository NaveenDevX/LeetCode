class Solution {
    private int [][] dp;

    public boolean solve(int index, int op, String str, int len)
    {
        if(index == len) return op == 0;

        if(dp[index][op] != -1) return dp[index][op]==1;

        boolean isTrue = false;

        char ch = str.charAt(index);

        if(ch == '(')
        {
            isTrue |= solve(index+1, op+1,str, len);
        }
        else if(ch == '*')
        {
            isTrue |= solve(index+1, op+1, str, len);
            isTrue |= solve(index+1, op, str, len);

            if(op > 0)
            {
                isTrue |= solve(index+1, op-1, str, len);
            }
        }
        else{
            if(op > 0)
            {
                isTrue |= solve(index+1, op-1, str, len);
            }
        }
        dp[index][op] = isTrue ? 1 : 0;

        return isTrue;

    }
    public boolean checkValidString(String s) {
        int n = s.length();
        dp = new int[n+1][n+2];
        for(int [] row : dp)
        {
            Arrays.fill(row, -1);
        }

        return solve(0,0,s,n);
    }
}