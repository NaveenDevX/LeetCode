class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        int n1 = 1, n2 = 2, n3;
        for(int i = 3; i <= n; i++) {  // Change here: i <= n
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }
}
