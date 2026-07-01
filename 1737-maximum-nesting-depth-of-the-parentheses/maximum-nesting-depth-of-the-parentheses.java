class Solution {
    public int maxDepth(String s) {
        int c = 0;
        int max = Integer.MIN_VALUE;
        for(char ch : s.toCharArray())
        {
            if(ch == '(') c++;

            if(ch == ')') c--;

            max = Math.max(max, c);
        }
        return max;
    }
}