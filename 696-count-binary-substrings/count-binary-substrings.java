class Solution {
    public int countBinarySubstrings(String s) {
       int prev = 0, curr = 1;
       int n = s.length();
       int ans = 0;
       for(int i=1;i<n;i++)
       {
            if(s.charAt(i) == s.charAt(i-1))
            {
                curr++;
            }
            else{
                prev = curr;
                curr = 1;
            }

            if(curr <= prev) ans++;
       }
       return ans;
    }
}