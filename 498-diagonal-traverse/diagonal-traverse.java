class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        List<Integer> res = new ArrayList<>();
        int m = mat.length;
        int n = mat[0].length;

        for (int row = 0; row < m; row++) {
            List<Integer> diag = new ArrayList<>();
            int i = row, j = 0;
            while (i >= 0 && j < n) {
                diag.add(mat[i][j]);
                i--; j++;
            }
            if (row % 2 != 0) Collections.reverse(diag);
            res.addAll(diag);
        }

        for (int col = 1; col < n; col++) {
            List<Integer> diag = new ArrayList<>();
            int i = m - 1, j = col;
            while (i >= 0 && j < n) {
                diag.add(mat[i][j]);
                i--; j++;
            }
            int diagIndex = (m - 1) + col;
            if (diagIndex % 2 != 0) Collections.reverse(diag);
            res.addAll(diag);
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}