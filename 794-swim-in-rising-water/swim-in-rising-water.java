class Solution {
    public int swimInWater(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

        int low = Math.max(grid[0][0], 0);
        int high = 0;

        // find max elevation for upper bound
        for (int[] row : grid) {
            for (int val : row) {
                high = Math.max(high, val);
            }
        }

        // binary search for minimum time
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canSwim(grid, mid, m, n, directions))
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }

    private boolean canSwim(int[][] grid, int mid, int m, int n, int[][] directions) {
        if (grid[0][0] > mid) return false;

        boolean[][] visited = new boolean[m][n];
        return dfs(grid, 0, 0, mid, m, n, visited, directions);
    }

    private boolean dfs(int[][] grid, int i, int j, int mid, int m, int n,
                        boolean[][] visited, int[][] directions) {

        if (i == m - 1 && j == n - 1) return true;

        visited[i][j] = true;

        for (int[] d : directions) {
            int ni = i + d[0];
            int nj = j + d[1];

            if (ni >= 0 && ni < m && nj >= 0 && nj < n &&
                    !visited[ni][nj] &&
                    grid[ni][nj] <= mid) {

                if (dfs(grid, ni, nj, mid, m, n, visited, directions))
                    return true;
            }
        }
        return false;
    }
}
