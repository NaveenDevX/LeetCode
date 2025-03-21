class Solution {
    int[][] dirs = {{1,0}, {0,1}, {-1,0}, {0,-1}};  
    
    public int getMaximumGold(int[][] grid) {
        int maxGold = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] > 0) {  
                    maxGold = Math.max(maxGold, dfs(grid, i, j));
                }
            }
        }
        return maxGold;
    }

    public int dfs(int[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] <= 0) 
            return 0;

        int temp = grid[i][j];
        grid[i][j] = -1;

        int goldCollected = 0;

        for(int[] dir : dirs) {
            goldCollected = Math.max(goldCollected, dfs(grid, i + dir[0], j + dir[1]));
        }

        grid[i][j] = temp;
        goldCollected += temp;

        return goldCollected;
    }
}
