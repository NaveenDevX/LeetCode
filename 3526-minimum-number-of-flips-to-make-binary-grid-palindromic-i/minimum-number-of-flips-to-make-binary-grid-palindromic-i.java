class Solution {
    public int minFlips(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int a = 0, b = 0;
        for(int i=0;i<row;i++)
        {
            int left = 0, right = grid[i].length-1;
            while(left < right)
            {
                if(grid[i][left] != grid[i][right]) a++;

                left++;
                right--;
            }
        }

        for(int i=0;i<col;i++)
        {
            int left = 0, right = grid.length-1;
            while(left < right)
            {
                if(grid[left][i] != grid[right][i]) b++;

                left++;
                right--;
            }
        }

        return (a > b) ? b : a;
    }
}