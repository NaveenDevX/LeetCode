class Solution {
    public String makeSmallestPalindrome(String s) {
       int n =s.length();
       char[] ch = s.toCharArray();
       int left =0;
       int right = n-1;
       int op=0;
       while(left<right)
       {
         if(s.charAt(left)<s.charAt(right))
        {
            ch[right]=s.charAt(left);
            op++;
        }
        else{
            ch[left]=s.charAt(right);
            op++;
        }
        left++;
        right--;
       }
        StringBuilder sb = new StringBuilder();
        for(char c: ch)
        {
            sb.append(c);
        }
        return sb.toString();
    }
}