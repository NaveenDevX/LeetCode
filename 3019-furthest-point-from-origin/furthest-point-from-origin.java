class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int x=0, y=0;
        for(char ch : moves.toCharArray())
        {
            if(ch == 'L' || ch=='_') x++;
            else x--;
        }
        for(char ch : moves.toCharArray())
        {
            if(ch=='R'||ch=='_') y++;
            else y--;
        }

        return Math.max(Math.abs(x), Math.abs(y));
    }
}