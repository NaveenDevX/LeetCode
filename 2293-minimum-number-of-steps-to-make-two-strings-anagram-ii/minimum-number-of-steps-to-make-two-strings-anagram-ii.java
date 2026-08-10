class Solution {
    public int minSteps(String s, String t) {
      int [] s_s = new int[26];
      for(char ch : s.toCharArray())
      {
          s_s[ch-'a']++;
      }
      for(char ch : t.toCharArray())
      {
        s_s[ch-'a']--;
      }
      int res = 0;
      for(int num : s_s)
      {
         res += Math.abs(num);
      }

      return res;
    }
}