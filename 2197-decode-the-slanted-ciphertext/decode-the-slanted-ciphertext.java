class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int len = encodedText.length();
        int cols = len / rows;

        char [][] matrix = new char[rows][cols];
        for(int i = 0; i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j] = encodedText.charAt(i*cols + j);
            }
        }
        StringBuilder res = new StringBuilder();

        for(int idx = 0; idx < cols; idx++)
        {
            int m = 0, n = idx;
            while(m < rows && n < cols)
            {
                res.append(matrix[m][n]);
                m++;
                n++;
            }
        }
        return res.toString().stripTrailing();
    }
}