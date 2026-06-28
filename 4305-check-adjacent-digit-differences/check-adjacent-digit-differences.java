class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int count = 0;
        int n = s.length();
        for(int i=0;i<n-1;i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(Math.abs((ch1-'0') -(ch2-'0')) > 2) return false; 
        }

       return true;
    }
}