class Solution {
    public String winningPlayer(int x, int y) {
        int game = Math.min(x,y/4);

        return (game % 2==1) ? "Alice":"Bob";
    }
}