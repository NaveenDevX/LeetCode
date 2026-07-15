class Solution {
    public String shiftingLetters(String s, int[] shifts) {
       int n = shifts.length; 
       long [] suffix = new long[n];
       suffix[n-1] = shifts[n-1];
       for(int i=n-2;i>=0;i--)
       {
          suffix[i] = suffix[i+1] + shifts[i];
       }
       StringBuilder sb = new StringBuilder();
       int m = s.length();
       for(int i=0;i<m;i++)
       {
          int shift = (int)((s.charAt(i) -'a' + suffix[i]) % 26);
          char ch  = (char) ('a' + shift);
          sb.append(ch);
       }  
       return sb.toString();                            
    }
}