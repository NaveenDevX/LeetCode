class Solution {
    public int diagonalSum(int[][] mat) {
       int ans =0;
       int n= mat.length;
       for(int i=0;i<n;i++){
        ans+=mat[i][i];
        ans+=mat[i][n-i-1];
       } 
       if(n%2 == 1)
       {
        int middle= n/2;
        ans-=mat[middle][middle];
       }
       return ans;
    }
}