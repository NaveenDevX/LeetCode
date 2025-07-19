import java.util.Arrays;
class Solution {
    public int minPathSum(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int[][] dp=new int[row][col];
        for(int[] r:dp) {
            Arrays.fill(r,-1);
        }
        return minPath(row-1,col-1,grid,dp);
    }
    static int minPath(int i,int j,int[][] grid,int[][] dp) {
        if(i==0&&j==0) return grid[0][0];
        if(i<0||j<0) return Integer.MAX_VALUE;

        if(dp[i][j]!=-1)
           return dp[i][j];
        int up=minPath(i-1,j,grid,dp);
        int left=minPath(i,j-1,grid,dp);

        dp[i][j]=grid[i][j]+Math.min(up,left);
        return dp[i][j];
    }
}
