class Solution {
    public String smallestString(String s) {
        int n = s.length();
        char [] ch = s.toCharArray();
        int i=0;
        while(i<n && ch[i] == 'a')
        {
            i++;
        }
         if(i==n)
        {
            ch[n-1] = 'z';
            return new String(ch);
        }
        while(i<n && ch[i]!='a')
        {
            ch[i] = (char)(ch[i] - 1);
            i++;
        }
        return new String(ch);
    }
}