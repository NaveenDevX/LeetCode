class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int len = s.length();
        int [] res = new int[len];
        for(int i=0;i<len;i++)
        {
            int row = startPos[0];
            int col = startPos[1];
            int count  = 0;
            for(int j=i;j<len;j++){
                char ch = s.charAt(j);
                if(ch == 'R') col++;
                else if(ch == 'L')col--;
                else if(ch == 'U') row--;
                else row++;

                count++;

                if(row < 0 || row >= n || col < 0 || col >= n) break;

                res[i] = count;

            }
        }
        return res;
    }
}