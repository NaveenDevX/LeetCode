class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       int m = grid.length;
       int n = grid[0].length;
       int [][]arr= new int[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            int ans=(i*n+j+k) % (m*n);
            int x = ans / n;
            int y= ans % n;
            arr[x][y]=grid[i][j];
        }
    }

       List<List<Integer>> res = new ArrayList<>();
       for(int i=0;i<m;i++)
       {
        List<Integer>ans = new ArrayList<>();
        for(int j=0;j<n;j++){
            ans.add(arr[i][j]);
        }
        res.add(ans);
       }
       return res;
    }
}