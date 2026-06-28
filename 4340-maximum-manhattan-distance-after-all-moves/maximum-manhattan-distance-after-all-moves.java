class Solution {
    public int maxDistance(String moves) {
        int u = 0, d = 0, l = 0, r = 0, under = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'L') l++;
            if (ch == 'R') r++;
            if (ch == 'U') u++;
            if (ch == 'D') d++;
            if (ch == '_') under++;
        }
        int x = Math.abs(r - l);
        int y = Math.abs(u - d);
        int md = x + y;

        return md + under;
    }
}